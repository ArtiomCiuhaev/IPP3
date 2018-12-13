package Command;

public class EthernetCommand implements Command {
    Ethernet ethernet;

    public EthernetCommand(Ethernet ethernet) {
        this.ethernet = ethernet;
    }

    @Override
    public void execute() {
        ethernet.makeEthernetConnection();
    }
}
