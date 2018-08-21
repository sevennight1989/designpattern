package af.co.design.observer;

import af.co.design.utils.Log;

public class Observer1 implements Observer {
    @Override
    public void update() {
        Log.d("Observer1 has received");
    }
}
