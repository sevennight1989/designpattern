package af.co.design.interpreter;

/**
 * 解析器
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
