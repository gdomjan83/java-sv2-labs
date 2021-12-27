package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String actual : billItems) {
            String[] split = actual.split(";");
            int total = Integer.valueOf(split[1]) * Integer.valueOf(split[2]);
            sb.append(String.format("%s, %s * %s = %d Ft\n", split[0], split[2], split[1], total));
        }
        return new String(sb);
    }
}
