package algorithmscount.heights;

import java.util.List;

public class Height {
    public int countChildrenWithHeightGreaterThan(List<Integer> children, int minHeight)  {
        int count = 0;
        for (Integer actual : children) {
            if (actual >= minHeight) {
                count++;
            }
        }
        return count;
    }
}
