package stringmethods.urlprocessor;

public class UrlMain {
    public static void main(String[] args) {
        UrlManager urlManager = new UrlManager("Https://Earthuake.USGS.gov:20630/fdsnws/event/1/" +
                "query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");

        System.out.println("Protocol: " + urlManager.getProtocol());
        System.out.println("Host: " + urlManager.getHost());
        System.out.println("Port: " + urlManager.getPort());
        System.out.println("Path: " + urlManager.getPath());
        System.out.println("Query: " + urlManager.getQuery());
        System.out.println("Has query \"starttime\": " + urlManager.hasProperty("starttime"));
        System.out.println("Property: " + urlManager.getProperty("starttime"));
    }
}
