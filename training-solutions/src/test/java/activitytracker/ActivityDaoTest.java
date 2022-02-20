package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {
    private ActivityDao activityDao;

    TrackPoint trackPoint1 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2381020, 18.5411940);
    TrackPoint trackPoint2 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2481230, 18.5411780);
    TrackPoint trackPoint3 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2602470, 18.5472280);
    TrackPoint trackPoint4 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2802550, 18.5472310);
    TrackPoint trackPoint5 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2002552, 18.5472312);
    TrackPoint trackPoint6 = new TrackPoint(LocalDate.of(2021, 3, 14), 95.2002552, 18.5472312);

    Activity activity1 = new Activity(1, LocalDateTime.of(2022, 1, 5, 10, 22), "futás", Type.RUNNING,
            List.of(trackPoint1, trackPoint2));
    Activity activity2 = new Activity(2, LocalDateTime.of(2022, 1, 8, 15, 5), "biciklizés", Type.BIKING,
            List.of(trackPoint3, trackPoint4, trackPoint2));
    Activity activity3 = new Activity(3, LocalDateTime.of(2022, 2, 15, 8, 45), "mászás", Type.HIKING,
            List.of(trackPoint1, trackPoint4, trackPoint5));
    Activity activity4 = new Activity(4, LocalDateTime.of(2022, 3, 15, 8, 45), "kosarazás", Type.BASKETBALL,
            List.of(trackPoint1, trackPoint4, trackPoint5, trackPoint6));

    @BeforeEach
    void init() {
        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("root456");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not connect to database.", sqle);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);
    }

    @Test
    void testInsertAndQuery() {
        Activity activity = activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);
        assertEquals(3, activityDao.listActivities().size());
        assertEquals(activity1, activityDao.findActivityById(1));
        assertEquals(3, activityDao.findActivityById(2).getTrackPoints().size());
        assertEquals(47.2381020, activityDao.findActivityById(3).getTrackPoints().get(0).getLat(), 0.005);
    }

    @Test
    void testInvalidCoordinates() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> activityDao.saveActivity(activity4));
        assertEquals("Invalid coordinates.", e.getMessage());
    }
}