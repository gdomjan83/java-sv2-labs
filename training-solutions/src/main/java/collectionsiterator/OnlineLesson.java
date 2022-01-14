package collectionsiterator;

import java.time.LocalDateTime;

public class OnlineLesson {
    private String teacherName;
    private String lessonTitle;
    private LocalDateTime startTime;

    public OnlineLesson(String teacher, String lesson, LocalDateTime start) {
        this.teacherName = teacher;
        this.lessonTitle = lesson;
        this.startTime = start;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getLessonTitle() {
        return lessonTitle;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }
}
