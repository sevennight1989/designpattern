package af.co.design.flyweight;

import af.co.design.utils.Log;

import java.util.HashMap;

/**
 * 享元模式
 */
public class FlyweightFactory {
    private HashMap<Object, Flyweight> data;

    public FlyweightFactory() {
        data = new HashMap<>();
    }

    public Flyweight getFlyweight(Object obj) {
        if (data.containsKey(obj)) {
            Log.d("Contains key");
            return data.get(obj);
        } else {
            Log.d("Not Contains key");
            Flyweight flyweight = new Flyweight(obj);
            data.put(obj, flyweight);
            return flyweight;
        }
    }
}
