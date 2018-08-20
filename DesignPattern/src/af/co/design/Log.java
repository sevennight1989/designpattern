package af.co.design;

/**
 * Log工具类
 */
public class Log {

    private static final boolean enableLog = true;

    public static void d(String str) {
        if (enableLog) {
            System.out.println(str);
        }

    }
}