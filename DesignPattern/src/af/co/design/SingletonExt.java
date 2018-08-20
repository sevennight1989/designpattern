package af.co.design;

import af.co.design.utils.Log;

/**
 * 单例
 * 
 * @author ZhangPeng-PC
 * 
 */
public class SingletonExt {
	private SingletonExt() {

	}
	
	public void printMsg(){
		Log.d("Get Singleton...");
	}

	private static class SingletonBuild {
		private static SingletonExt value = new SingletonExt();
	}

	public static SingletonExt getInstance() {
		return SingletonBuild.value;
	}
}
