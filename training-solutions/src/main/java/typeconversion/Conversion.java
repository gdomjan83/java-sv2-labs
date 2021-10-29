package typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double value) {
        int convertedValue = (int) value;
        return (double) convertedValue;
    }

    public byte[] convertIntArrayToByteArray(int[] array) {
        byte[] newArray = new byte[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 || 127 < array[i] ) {
                newArray[i] = (byte) -1;
            } else {
                newArray[i] = (byte) array[i];
            }
        }

        return newArray;
    }

    public int getFirstDecimal(double number) {
        int value1 = (int) number;
        double value2 = (number - value1) * 10;
        return (int) value2;
    }

}
