package Observer;

import java.util.ArrayList;
import java.util.List;

public class AppStore {
        private List<Subscription> sub = new ArrayList<>();
        private int state;

    public AppStore() {
    }

    public void add(Subscription s) {
            sub.add(s);
        }

        public void execute() {
            for (Subscription subscription : sub) {
                subscription.observe();
            }
        }
}
