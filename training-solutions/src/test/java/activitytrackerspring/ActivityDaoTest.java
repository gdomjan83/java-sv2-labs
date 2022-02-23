package activitytrackerspring;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    private ActivityDao activityDao;

    Activity activity1 = new Activity(1, LocalDateTime.of(2022, 1, 5, 10, 22), "futás", Type.RUNNING);
    Activity activity2 = new Activity(2, LocalDateTime.of(2022, 1, 8, 15, 5), "biciklizés", Type.BIKING);
    Activity activity3 = new Activity(3, LocalDateTime.of(2022, 2, 15, 8, 45), "mászás", Type.HIKING);
    Activity activity4 = new Activity(4, LocalDateTime.of(2022, 3, 15, 8, 45), "kosarazás", Type.BASKETBALL);

    @BeforeEach
    void init() {
        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("root456");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot connect.", sqle);
        }

        activityDao = new ActivityDao(dataSource);

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

    }

    @Test
    void testSaveActivity() {
        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        int id = activityDao.saveActivity(activity3);
        activityDao.saveActivity(activity4);
        assertEquals(4, activityDao.queryActivities().size());
        assertEquals("biciklizés", activityDao.queryActivities().get(1).getDesc());
        assertEquals(activity2, activityDao.findActivityById(2));
        assertEquals(activity3, activityDao.findActivityById(id));
    }
}