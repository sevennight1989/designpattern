package af.co.design.observer;

import af.co.design.utils.Log;

public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        Log.d("Update Self");
        notifyObservers();
    }
}
