package cmdarguments.flowers;

public class CmdMain {
    public static void main(String[] args) {
        int len = args.length;
        System.out.println("Tömb hossza: " + len);

        for (int i = 0; i < len; i++) {
            System.out.println((i + 1) + ". elem: " + args[i]);
        }
    }
}
