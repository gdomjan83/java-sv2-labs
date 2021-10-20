package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        System.out.println(prefix);
        String name = "John Doe";
        System.out.println(name);
        String message = prefix + name;
        System.out.println(message);
        message = message + 444;
        System.out.println(message);
        boolean b = message.equals("Hello John Doe");
        System.out.println(b);
        boolean c = message.equals("Hello John Doe444");
        System.out.println(c);

        String empty1 = "";
        String empty2 = "";
        String text = empty1 + empty2;
        System.out.println(text);
        System.out.println("Length: " + text.length());

        String text2 = "Abcde";
        System.out.println(text2.length());
        System.out.println(text2.substring(0, 1) + ", " + text2.substring(2, 3));
        System.out.println(text2.substring(0, 3));
    }
}
