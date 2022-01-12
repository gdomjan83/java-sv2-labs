package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {
    public List<DnsEntry> dnsEntries = new ArrayList<>();

    public void addEntry(String hostName, String hostIp) {
        for (DnsEntry actual : dnsEntries) {
            if (actual.hostName.equals(hostName) || actual.hostIp.equals(hostIp)) {
                throw new IllegalArgumentException("Already exists");
            }
        }
        dnsEntries.add(new DnsEntry(hostName, hostIp));
    }

    public void removeEntryByName(String hostName) {
        DnsEntry remove = null;
        for (DnsEntry actual : dnsEntries) {
            if (actual.hostName.equals(hostName)) {
                remove = actual;
            }
        }
        if (remove != null) {
            dnsEntries.remove(remove);
        }
    }

    public void removeEntryByIp(String hostIp) {
        DnsEntry remove = null;
        for (DnsEntry actual : dnsEntries) {
            if (actual.hostIp.equals(hostIp)) {
                remove = actual;
            }
        }
        if (remove != null) {
            dnsEntries.remove(remove);
        }
    }

    public String getIpByName(String hostName) {
        for (DnsEntry actual : dnsEntries) {
            if (actual.hostName.equals(hostName)) {
                return actual.hostIp;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public String getNameByIp(String hostIp) {
        for (DnsEntry actual : dnsEntries) {
            if (actual.hostIp.equals(hostIp)) {
                return actual.hostName;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public List<DnsEntry> getDnsEntries() {
        return dnsEntries;
    }

    public static class DnsEntry {
        private String hostName;
        private String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }

        public String getHostName() {
            return hostName;
        }

        public String getHostIp() {
            return hostIp;
        }
    }
}
