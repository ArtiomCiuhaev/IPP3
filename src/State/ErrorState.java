package State;

public class ErrorState implements State{
    @Override
    public void action(Mode mode) {
        System.out.println(" TV is in Error state when something wrong");
        mode.setState(this);
    }
}
