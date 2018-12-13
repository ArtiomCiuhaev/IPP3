package ChainOfRespons;

public class SportChannel implements Comand {
    private Comand command;
    private String channelName;

    public SportChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void setCommand(Comand command) {
        this.command = command;
    }

    @Override
    public void create(SportCategory sportCategory) {
        System.out.println(" Get command by " + channelName);
    }

    @Override
    public String getCommand() {
        return channelName;
    }
}
