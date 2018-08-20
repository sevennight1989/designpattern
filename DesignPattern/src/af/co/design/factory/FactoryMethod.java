package af.co.design.factory;

import af.co.design.utils.Log;

/**
 * 工厂模式
 */
public class FactoryMethod {
    public interface Food {
        void printFood();
    }

    static class A implements Food {
        @Override
        public void printFood() {
            Log.d("Get A...");
        }
    }

    static class B implements Food {
        @Override
        public void printFood() {
            Log.d("Get B...");
        }
    }

    static class C implements Food {
        @Override
        public void printFood() {
            Log.d("Get C...");
        }
    }

    public static class StaticFactory {
    	public static Food getA() {
            return new A();
        }

    	public static Food getB() {
            return new B();
        }

    	public static Food getC() {
            return new C();
        }
    }


}









