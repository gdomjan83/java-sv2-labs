package activitytrackerspring;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Activity {
    private int id;
    private LocalDateTime startTime;
    private String desc;
    private Type type;

    public Activity(int id, LocalDateTime startTime, String desc, Type type) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDesc() {
        return desc;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return id == activity.id && Objects.equals(startTime, activity.startTime) && Objects.equals(desc, activity.desc) && type == activity.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, desc, type);
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", desc='" + desc + '\'' +
                ", type=" + type +
                '}';
    }
}