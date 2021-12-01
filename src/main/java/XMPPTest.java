import org.jivesoftware.smack.*;

public class XMPPTest {
    public static void main(String[] args) {
        XMPPConnection connection;
        ConnectionConfiguration config = new ConnectionConfiguration("openfire", 9090);
        // config.setSecurityMode(ConnectionConfiguration.SecurityMode.required);
        // config.setSASLAuthenticationEnabled(false);
        // config.setCompressionEnabled(false);
        config.setDebuggerEnabled(true);
        // System.setProperty("java.awt.headless", "true");

        try {
            connection = new XMPPConnection(config);
            connection.connect();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
