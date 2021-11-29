package methodpass;

public class One {
    public static void main(String[] args) {
        One one = new One();

        int number = 0;
        System.out.println(number);

        number++;
        System.out.println(number);

        System.out.println(one.addOne(number));
    }

    public int addOne(int number) {
        return number + 1;
    }
}
