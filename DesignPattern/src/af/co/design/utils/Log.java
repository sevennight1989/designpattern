package af.co.design.utils;

/**
 * Log工具类
 */
public class Log {

	private static final boolean enableLog = true;

	private static final int LINE_COUNT = 60;

	public static void d(String str) {
		append(str);
		if (enableLog)
			nextLine();
	}

	private static void nextLine() {
		System.out.println();
	}

	private static void append(String str) {
		if (enableLog) {
			System.out.print(str);
		}
	}

	public static void splitLine() {
		int i = 0;
		while (i < LINE_COUNT) {
			append("-");
			i++;
		}
		if (enableLog)
			nextLine();
	}
}