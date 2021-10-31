package stringmethods.urlprocessor;

public class UrlManager {
    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;
    private String url;

    public UrlManager(String url){
        this.url = url;
    }

    public String getProtocol() {
        int colonIndex = url.indexOf(":");
        return url.substring(0, colonIndex).toLowerCase();
    }

    public String getHost() {
        String trimmed = url.replace(getProtocol().concat("://"), "");
        int colonIndex = trimmed.indexOf(":");
        int slashIndex = trimmed.indexOf("/");
        if (colonIndex != -1) {
            return trimmed.substring(0, colonIndex);
        } else {
            return trimmed.substring(0, slashIndex);
        }
    }

    public Integer getPort() {
        String trimmed = url.replace(getProtocol().concat("://"), "").replace(getHost(), "");
        int colonIndex = trimmed.indexOf(":");
        int slashIndex = trimmed.indexOf("/");
        if (colonIndex != -1) {
            String port = trimmed.substring(colonIndex + 1, slashIndex);
            return Integer.parseInt(port);
        } else {
            return null;
        }
    }

    public String getPath() {
        int numberOfSlashes = 0;
        int thirdSlashIndex = 0;
        int questionMarkIndex = url.indexOf("?");
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) == '/') {
                numberOfSlashes++;
            }
            if (numberOfSlashes == 3) {
                thirdSlashIndex = i;
                break;
            }
        }
        if (thirdSlashIndex == 0) {
            return "";
        } else {
            if (questionMarkIndex != -1) {
                return url.substring(thirdSlashIndex + 1, questionMarkIndex);
            } else {
                return "";
            }
        }
    }

    public String getQuery() {
        int questionMarkIndex = url.indexOf("?");
        if (questionMarkIndex != -1) {
            return url.substring(questionMarkIndex + 1);
        } else {
            return "";
        }
    }

    public boolean hasProperty(String key) {
        if (getQuery().contains(key)) {
            return true;
        }
        return false;
    }

    public String getProperty(String key) {
        if (hasProperty(key)) {
            int keyIndex = getQuery().indexOf(key);
            int keyLength = key.length();
            int andIndex = getQuery().indexOf("&", keyIndex);
            if (andIndex != -1) {
                return getQuery().substring(keyIndex + keyLength + 1, andIndex);
            } else {
                return getQuery().substring(keyIndex + keyLength + 1);
            }
        } else {
            return "";
        }
    }
}
