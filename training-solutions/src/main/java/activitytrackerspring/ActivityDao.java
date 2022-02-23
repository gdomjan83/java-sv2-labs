package activitytrackerspring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class ActivityDao {
    private JdbcTemplate jdbcTemplate;

    public ActivityDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int saveActivity(Activity activity) {
        KeyHolder keyHolder = new GeneratedKeyHolder();

        //language=sql
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement stmt = con.prepareStatement("insert into activities (start_time, activity_desc, activity_type) values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
                stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
                stmt.setString(2, activity.getDesc());
                stmt.setString(3, activity.getType().toString());
                return stmt;
            }
        }, keyHolder);
        return keyHolder.getKey().intValue();
    }

    public List<Activity> queryActivities() {
        //language=sql
        return jdbcTemplate.query("select * from activities", (rs, i) ->
                createActivity(rs));
    }

    private Activity createActivity(ResultSet rs) throws SQLException {
        return new Activity(rs.getInt("id"),
                rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("activity_desc"),
                Type.valueOf(rs.getString("activity_type")));
    }

    public Activity findActivityById(int id) {
        //language=sql
        return jdbcTemplate.queryForObject("select * from activities where id = ?", (rs, i) -> createActivity(rs), id);
    }


}
