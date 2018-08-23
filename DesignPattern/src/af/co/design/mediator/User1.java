package af.co.design.mediator;

import af.co.design.utils.Log;

public class User1 extends User {
    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        Log.d("User1 exec!");
    }
}
