package auxiliary;

/**
 * Created by R.Eduard on 20.11.2017.
 */
public class ConnectionNode {
    private String ipAddress;
    private Integer port;

    public ConnectionNode() {

    }

    public ConnectionNode(String ipAddress, Integer port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
