package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {
    public static void main(String[] args) {
        Activity activity1 = new Activity(1, LocalDateTime.of(2022, 1, 5, 10, 22), "futás", Type.RUNNING);
        Activity activity2 = new Activity(2, LocalDateTime.of(2022, 1, 8, 15, 5), "biciklizés", Type.BIKING);
        Activity activity3 = new Activity(3, LocalDateTime.of(2022, 2, 15, 8, 45), "mászás", Type.HIKING);

        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("root456");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not connect to database.", sqle);
        }

//        saveActivity(dataSource, activity1);
//        saveActivity(dataSource, activity2);
//        saveActivity(dataSource, activity3);
//        System.out.println(createActivityById(dataSource, 2));
//        System.out.println(createActivityById(dataSource, 3));
//        System.out.println(createActivityById(dataSource, 1));
        System.out.println(getActivities(dataSource));
    }

    private static void saveActivity(DataSource dataSource, Activity activity) {
        try (Connection conn = dataSource.getConnection();
             //language=sql
             PreparedStatement stmt = conn.prepareStatement("insert into activities (start_time, activity_desc, activity_type) values (?, ?, ?)")) {

            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.execute();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not insert into database.", sqle);
        }
    }

    private static Activity createActivityById(DataSource dataSource, int id) {
        try (Connection conn = dataSource.getConnection();
             //language=sql
             PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?")) {
            stmt.setInt(1, id);

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

    private static List<Activity> getActivities(DataSource dataSource) {
        try (Connection conn = dataSource.getConnection();
             //language=sql
            PreparedStatement stmt = conn.prepareStatement("select * from activities ");
            ResultSet rs = stmt.executeQuery()) {
            List<Activity> result = new ArrayList<>();
            while (rs.next()) {
                result.add(createActivityById(dataSource, rs.getInt("id")));
            }
            return result;
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not query.", sqle);
        }
    }
}
