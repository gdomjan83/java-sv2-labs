package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam {
    private List<ExamResult> examResults;

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<ExamResult> getExamResults() {
        return examResults;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        int finalPlaces = Math.min(places, examResults.size());
        Collections.sort(examResults);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < finalPlaces; i++) {
            result.add(examResults.get(i).getName());
        }
        return result;
    }
}
