package array;

public class ArrayHandlerMain {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 12, 3, 95};
        String[] words = {"Queen", "Poets of the Fall", "Michael Jackson", "Muse"};

        ArrayHandler arrayHandler = new ArrayHandler();
        arrayHandler.addIndexToNumber(numbers);
        for (int item: numbers) {
            System.out.println(item);
        }
        for (int item: numbers) {
            System.out.print(item + ", ");
        }

        System.out.println();

        arrayHandler.concatenateIndexToWord(words);
        for (String item: words) {
            System.out.println(item);
        }
        for (String item: words) {
            System.out.print(item + ", ");
        }
    }



}
