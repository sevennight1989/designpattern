package af.co.design.visitor;

import af.co.design.utils.Log;

/**
 * 访问者
 */
public class VisitorDemo {
    public interface Service{
        void accept(Visitor visitor);
    }

    public static class Visitor{
        public void process(Service service){
            Log.d("基本业务");
        }

        public void process(Saving service){
            Log.d("存款");
        }

        public void process(Draw service){
            Log.d("提款");
        }

        public void process(Fund service){
            Log.d("基金");
        }

    }

    public static class Saving implements Service{

        @Override
        public void accept(Visitor visitor) {
          visitor.process(this);
        }
    }

    public static class Draw implements Service{

        @Override
        public void accept(Visitor visitor) {
            visitor.process(this);
        }
    }

    public static class Fund implements Service{

        @Override
        public void accept(Visitor visitor) {
            visitor.process(this);
        }
    }
}
