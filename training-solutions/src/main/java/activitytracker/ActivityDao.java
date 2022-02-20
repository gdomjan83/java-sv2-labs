package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {
    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public Activity saveActivity(Activity activity) {
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            return insertActivity(activity, conn);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not insert into database.", sqle);
        }
    }

    public Activity findActivityById(long id) {
        try (Connection conn = dataSource.getConnection();
             //language=sql
             PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?")) {
            stmt.setInt(1, (int) id);
            return createActivity(stmt);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not query.", sqle);
        }
    }

    private Activity insertActivity(Activity activity, Connection conn) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement(
                //language=sql
                "insert into activities (start_time, activity_desc, activity_type) values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {

            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
            long generatedKey = getGeneratedKey(stmt);
            saveTrackPoints(activity.getTrackPoints(), conn, generatedKey);
            conn.commit();
            return findActivityById(generatedKey);
        } catch (IllegalArgumentException iae) {
            conn.rollback();
            throw new IllegalArgumentException("Invalid coordinates.", iae);
        }
    }

    private void saveTrackPoints(List<TrackPoint> trackPoints, Connection conn, long generatedKey) throws SQLException {
        for (TrackPoint actual : trackPoints) {
            validateCoordinates(actual);
            saveTrackPointData(actual, conn, generatedKey);
        }
    }

    private void validateCoordinates(TrackPoint trackPoint) {
        if (trackPoint.getLat() < -90 || trackPoint.getLat() > 90 || trackPoint.getLon() < -180 || trackPoint.getLon() > 180) {
            throw new IllegalArgumentException("Invalid coordinates.");
        }
    }

    private void saveTrackPointData(TrackPoint trackPoint, Connection conn, long activityId) throws SQLException {
        //language=sql
        try (PreparedStatement stmt = conn.prepareStatement(
                "insert into track_point(start_time, latitude, longitude, activity_id) values (?, ?, ?, ?)")) {
            stmt.setDate(1, Date.valueOf(trackPoint.getTime()));
            stmt.setDouble(2, trackPoint.getLat());
            stmt.setDouble(3, trackPoint.getLon());
            stmt.setInt(4, (int) activityId);
            stmt.executeUpdate();
        }
    }

    private long getGeneratedKey(Statement stmt) throws SQLException{
        try (ResultSet resultset = stmt.getGeneratedKeys()) {
            if (resultset.next()) {
                return resultset.getLong(1);
            }
            throw new IllegalStateException("No generated key created.");
        }
    }

    private Activity createActivity(PreparedStatement stmt) throws SQLException {
        try(ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return new Activity(
                        rs.getInt(1),
                        rs.getTimestamp(2).toLocalDateTime(),
                        rs.getString(3),
                        Type.valueOf(rs.getString(4)),
                        listTrackPoints(rs.getInt(1)));
            }
            throw new IllegalStateException("No activity found.");
        }
    }

    public List<TrackPoint> listTrackPoints(int activityId) {
        List<TrackPoint> result = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             //language=sql
        PreparedStatement stmt = conn.prepareStatement("select * from track_point where activity_id = ?")) {
            stmt.setInt(1, activityId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    result.add(new TrackPoint(rs.getDate(2).toLocalDate(), rs.getFloat(3), rs.getFloat(4)));
                }
            }
            return result;
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not get trackpoints.", sqle);
        }
    }

    public List<Activity> listActivities() {
        try (Connection conn = dataSource.getConnection();
             //language=sql
             PreparedStatement stmt = conn.prepareStatement("select * from activities ");
             ResultSet rs = stmt.executeQuery()) {
            List<Activity> result = new ArrayList<>();
            while (rs.next()) {
                result.add(findActivityById(rs.getInt("id")));
            }
            return result;
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not query.", sqle);
        }
    }
}
