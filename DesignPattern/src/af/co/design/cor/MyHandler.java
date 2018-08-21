package af.co.design.cor;

import af.co.design.utils.Log;

/**
 * 责任链
 */
public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        Log.d(name + " deal!");
        if (getHandler() != null) {
            getHandler().operation();
        }

    }

}
