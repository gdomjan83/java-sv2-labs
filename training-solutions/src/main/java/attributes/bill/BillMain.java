package attributes.bill;

public class BillMain {
    public static void main(String[] args) {
        BillItem item = new BillItem("fogkefe", 1500, 2, 27);

        System.out.println(item.calculateTotalPrice());
    }
}
