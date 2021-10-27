package compositionlist;

public class CapsulesMain {
    public static void main(String[] args) {
        Capsules capsules = new Capsules();

        capsules.addFirst("red");
        capsules.addLast("white");
        capsules.addLast("green");
        capsules.addFirst("black");
        capsules.addFirst("violet");
        capsules.removeLast();
        capsules.removeFirst();
        capsules.removeFirst();

        System.out.println(capsules.getColours());
    }
}
