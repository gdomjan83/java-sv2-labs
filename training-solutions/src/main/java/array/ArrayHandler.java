package array;

public class ArrayHandler {
    public void addIndexToNumber(int[] source) {
        for (var i = 0; i < source.length; i++) {
            source[i] = source[i] + i;
        }
    }
    public void concatenateIndexToWord(String[] source) {
        for (var i = 0; i < source.length; i++) {
            source[i] = i + source[i] ;
        }
    }
}
