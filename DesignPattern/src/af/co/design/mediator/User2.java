package af.co.design.mediator;

import af.co.design.utils.Log;

public class User2 extends User {

    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        Log.d("User2 exec!");
    }
}
