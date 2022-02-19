package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {
    private ActivityDao activityDao;

    Activity activity1 = new Activity(1, LocalDateTime.of(2022, 1, 5, 10, 22), "futás", Type.RUNNING);
    Activity activity2 = new Activity(2, LocalDateTime.of(2022, 1, 8, 15, 5), "biciklizés", Type.BIKING);
    Activity activity3 = new Activity(3, LocalDateTime.of(2022, 2, 15, 8, 45), "mászás", Type.HIKING);

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
    }

}