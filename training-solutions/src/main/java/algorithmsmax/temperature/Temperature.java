package algorithmsmax.temperature;

import java.util.List;

public class Temperature {
    public int getMin(List<Integer> temps) {
        int min = Integer.MAX_VALUE;
        for (Integer temp : temps) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }
}
