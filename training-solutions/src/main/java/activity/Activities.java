package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {
    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        List<Report> result = new ArrayList<>();
        for (ActivityType actual : ActivityType.values()) {
            double distance = activities.stream().filter(a -> actual == a.getType()).mapToDouble(a -> a.getDistance()).sum();
            result.add(new Report(actual, distance));
        }
        return result;
    }

    public int numberOfTrackActivities() {
        return (int) activities.stream()
                .filter(a -> a.getClass() == ActivityWithTrack.class)
                .count();
    }

    public int numberOfWithoutTrackActivities() {
        return (int) activities.stream()
                .filter(a -> a.getClass() == ActivityWithoutTrack.class)
                .count();
    }
}
