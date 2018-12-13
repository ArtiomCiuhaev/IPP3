package ChainOfRespons;

public class Menu implements Comand {
    private Comand command;
    private String channelName;

    public Menu(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void setCommand(Comand command) {
        this.command = command;
    }

    @Override
    public void create(SportCategory sportCategory) {
        System.out.println(" " + channelName + " request to " + command.getCommand());
        command.create(sportCategory);
    }

    @Override
    public String getCommand() {
        return null;
    }
}
