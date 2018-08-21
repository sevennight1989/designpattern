package af.co.design.observer;

import af.co.design.utils.Log;

public class Observer2 implements Observer {
    @Override
    public void update() {
        Log.d("Observer2 has received");
    }
}
