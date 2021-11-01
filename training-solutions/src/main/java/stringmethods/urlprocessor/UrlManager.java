package stringmethods.urlprocessor;

public class UrlManager {
    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url){
        this.protocol = findProtocol(url);
        this.host = findHost(url);
        this.port = findPort(url);
        this.path = findPath(url);
        this.query = findQuery(url);
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public String findProtocol(String url) {
        int end = url.indexOf(":");
        return url.substring(0, end).toLowerCase();
    }

    public String findHost(String url) {
        int start = url.indexOf("/") + 2;
        int end = url.indexOf(":", start);
        if (end == -1) {
            end = url.indexOf("/", start);
            if (end == -1) {
                return url.substring(start).toLowerCase();
            } else {
                return url.substring(start, end).toLowerCase();
            }
        } else {
            return url.substring(start, end).toLowerCase();
        }
    }

    public Integer findPort(String url) {
        int start = url.indexOf("/") + 2;
        start = url.indexOf(":", start);
        if (start == -1) {
            return null;
        } else {
            int end = url.indexOf("/", start);
            if (end == -1) {
                return Integer.valueOf(url.substring(start + 1));
            } else {
                return Integer.valueOf(url.substring(start + 1, end));
            }
        }
    }

    public String findPath(String url) {
        int start = url.indexOf("/") + 2;
        start = url.indexOf("/", start);
        if (start == -1) {
            return "";
        } else {
            int end = url.indexOf("?", start);
            if (end == -1) {
                return url.substring(start + 1);
            } else {
                return url.substring(start + 1, end);
            }
        }
    }

    public String findQuery(String url) {
        int start = url.indexOf("?");
        if (start == -1) {
            return "";
        } else {
            return url.substring(start + 1);
        }
    }

    public boolean hasProperty(String key) {
        return query.startsWith(key + "=") || query.contains("&" + key + "=");
    }

    public String getProperty(String key) {
        if (hasProperty(key)) {
            if (query.startsWith(key + "=")) {
                int start = query.indexOf("=") + 1;
                int end = query.indexOf("&");
                if (end == -1) {
                    return query.substring(start);
                } else {
                    return query.substring(start, end);
                }
            } else if (query.contains("&" + key + "=")) {
                int start = query.indexOf("&" + key + "=");
                start = query.indexOf("=", start);
                int end = query.indexOf("&", start);
                if (end == -1) {
                    return query.substring(start + 1);
                } else {
                    return query.substring(start + 1, end);
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
