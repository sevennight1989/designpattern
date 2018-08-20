package af.co.design;

/**
 * 工厂模式
 */
public class FactoryMethod {
    interface Food {
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

    static class StaticFactory {
        static Food getA() {
            return new A();
        }

        static Food getB() {
            return new B();
        }

        static Food getC() {
            return new C();
        }
    }


}









