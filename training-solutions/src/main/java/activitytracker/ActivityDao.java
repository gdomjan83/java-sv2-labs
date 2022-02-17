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

    public void saveActivity(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             //language=sql
             PreparedStatement stmt = conn.prepareStatement(
                     "insert into activities (start_time, activity_desc, activity_type) values (?, ?, ?)")) {

            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.execute();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not insert into database.", sqle);
        }
    }

    public Activity findActivityById(long id) {
        try (Connection conn = dataSource.getConnection();
             //language=sql
            PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?")) {
            stmt.setInt(1, (int) id);

            try(ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Activity(
                            rs.getInt(1),
                            rs.getTimestamp(2).toLocalDateTime(),
                            rs.getString(3),
                            Type.valueOf(rs.getString(4)));
                }
                throw new IllegalStateException("No activity found.");
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not query.", sqle);
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
