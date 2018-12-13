package Command;

public class ConnectionSetting {
    Command command;
    public ConnectionSetting(Command command){
        this.command = command;
    }
    public void setCommand(Command command){
        this.command = command;
    }
    public void connect(){
        command.execute();
    }
}
