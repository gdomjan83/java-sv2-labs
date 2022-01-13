package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {
    private Map<String, Integer> paper = new HashMap<>();

    public Map<String, Integer> getPaper() {
        return paper;
    }


    public void putFurtherPaper(String className, int kilogramms) {
        if (paper.containsKey(className)) {
            paper.put(className, paper.get(className) + kilogramms);
        } else {
            paper.put(className, kilogramms);
        }
    }

    public String getWinnerClass() {
        int highest = Integer.MIN_VALUE;
        String result = "";
        for (Map.Entry<String, Integer> m : paper.entrySet()) {
            if (m.getValue() > highest) {
                highest = m.getValue();
                result = m.getKey();
            }
        }
        return result;
    }

    public int getTotalWeight() {
        int sum = 0;
        for (Integer i : paper.values()) {
            sum += i;
        }
        return sum;
    }
}
