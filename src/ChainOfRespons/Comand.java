package ChainOfRespons;

public interface Comand {
    void setCommand(Comand command);
    void create(SportCategory sportCategory);
    String getCommand();
}
