package State;

public class OffState implements State{
    @Override
    public void action(Mode mode) {
        System.out.println(" TV is in Off state when press button off");
        mode.setState(this);
    }
}
