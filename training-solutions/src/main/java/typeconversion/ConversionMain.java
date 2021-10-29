package typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();

        System.out.println(conversion.convertDoubleToDouble(3.158));

        int[] array = {2, 6, -4, 125, 130, 55, -9};
        System.out.println(Arrays.toString(conversion.convertIntArrayToByteArray(array)));

        System.out.println(conversion.getFirstDecimal(112.4856));
    }
}
