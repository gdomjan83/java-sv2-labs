package methodvarargs.examstats;

public class ExamStats {
    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        checkEmptyParameters(results);
        int countTopGrades = 0;
        int minimumPoint = getMinimumPoint(limitInPercent);
        for (Integer actual : results) {
            if (actual >= minimumPoint) {
                countTopGrades++;
            }
        }
        return countTopGrades;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        checkEmptyParameters(results);
        int minimumPoint = getMinimumPoint(limitInPercent);
        for (Integer actual : results) {
            if (actual < minimumPoint) {
                return true;
            }
        }
        return false;
    }

    private int getMinimumPoint(int limitInPercent) {
        return maxPoints * limitInPercent / 100;
    }

    private void checkEmptyParameters(int[] results) {
        if ((results == null) || (results.length == 0)) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
    }
}
