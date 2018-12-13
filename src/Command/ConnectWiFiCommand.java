package Command;

public class ConnectWiFiCommand implements Command {
    ConnectWiFi connectWiFi;

    public ConnectWiFiCommand(ConnectWiFi connectWiFi) {
        this.connectWiFi = connectWiFi;
    }

    @Override
    public void execute() {
        connectWiFi.makeWiFiConnection();
    }
}
