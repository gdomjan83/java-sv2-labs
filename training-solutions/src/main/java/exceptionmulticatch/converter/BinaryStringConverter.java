package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String input) {
        if (input == null) {
            throw new NullPointerException("Binary string is null.");
        }
        boolean[] result = new boolean[input.length()];
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '0') {
                result[i] = false;
            }else if (input.charAt(i) == '1') {
                result[i] = true;
            } else {
                throw new IllegalArgumentException("Binary string is not valid.");
            }
        }
        return result;
    }

    public String booleanArrayToBinaryString(boolean[] input) {
        if (input.length == 0) {
            throw new IllegalArgumentException("Boolean array is empty.");
        }
        if (input == null) {
            throw new NullPointerException("Boolean array is null.");
        }
        StringBuilder sb = new StringBuilder();
        for (boolean actual : input) {
            if (actual) {
                sb.append("1");
            }
            if (!actual) {
                sb.append("0");
            }
        }
        return sb.toString();
    }
}
