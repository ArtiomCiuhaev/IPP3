package State;

public class SleepState implements State {
    @Override
    public void action(Mode mode) {
        System.out.println(" TV is in Sleep state when you going ahead");
        mode.setState(this);
    }
}
