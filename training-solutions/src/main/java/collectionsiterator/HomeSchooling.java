package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {
    private List<OnlineLesson> lessons = new ArrayList<>();

    public List<OnlineLesson> getLessons() {
        return lessons;
    }

    public void addNewLesson(OnlineLesson lesson) {
        int count = lessons.size();
        for (int i = 0; i < lessons.size() - 1; i++) {
            LocalDateTime lessonBefore = lessons.get(i).getStartTime();
            LocalDateTime lessonAfter = lessons.get(i + 1).getStartTime();
            if (lessonBefore.isBefore(lesson.getStartTime()) && lessonAfter.isAfter(lesson.getStartTime())) {
                count = i + 1;
            }
        }
        lessons.add(count, lesson);
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> result = new ArrayList<>();
        Iterator<OnlineLesson> i = lessons.iterator();
        while (i.hasNext()) {
            OnlineLesson actual = i.next();
            if (title.equals(actual.getLessonTitle())) {
                result.add(actual);
            }
        }
        return result;
    }

    public void removeLesson(LocalDateTime startTime) {
        Iterator<OnlineLesson> i = lessons.iterator();
        while (i.hasNext()) {
            OnlineLesson actual = i.next();
            if (actual.getStartTime().equals(startTime)) {
                i.remove();
            }
        }
    }
}
