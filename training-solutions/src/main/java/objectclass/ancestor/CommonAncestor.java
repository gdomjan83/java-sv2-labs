package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(new Fruit());
        list.add(new Apple());
        list.add(new Starking());
        list.add(new Vegetable());
        list.add("alma");
        list.add(12);
        list.add('x');
        list.add(LocalDate.of(2021, 12, 4));
        list.add(new int[] {3, 5, 8});
        list.add(Arrays.asList("alfa", "béta", "gamma"));

        System.out.println(list);
    }
}
