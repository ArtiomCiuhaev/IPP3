package ChainOfRespons;

public class ApStore implements Comand {
    private Comand command;
    private String clientName;

    public ApStore(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void setCommand(Comand command) {
        this.command = command;
    }

    @Override
    public void create(SportCategory sportCategory) {
        System.out.println(" " + clientName + " request to " + command.getCommand());
        command.create(sportCategory);
    }

    @Override
    public String getCommand() {
        return clientName;
    }
}
