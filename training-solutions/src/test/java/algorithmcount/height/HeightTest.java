package algorithmcount.height;

import algorithmscount.heights.Height;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightTest {
    @Test
    void testCounter() {
        Height height = new Height();

        int count = height.countChildrenWithHeightGreaterThan(Arrays.asList(155, 160, 140, 139, 145), 145);
        assertEquals(3, count);
    }
}
