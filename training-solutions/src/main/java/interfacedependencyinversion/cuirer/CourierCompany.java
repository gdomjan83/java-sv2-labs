package interfacedependencyinversion.cuirer;

public class CourierCompany {
    public static void main(String[] args) {
        SmallBox sb = new SmallBox();
        System.out.println(sb.getSize());
        System.out.println(sb.getPrice());

        MediumBox mb = new MediumBox();
        System.out.println(mb.getSize());
        System.out.println(mb.getPrice());

        LargeBox lb = new LargeBox();
        System.out.println(lb.getSize());
        System.out.println(lb.getPrice());

        ExtraLargeBox elb = new ExtraLargeBox();
        System.out.println(elb.getSize());
        System.out.println(elb.getPrice());
    }
}
