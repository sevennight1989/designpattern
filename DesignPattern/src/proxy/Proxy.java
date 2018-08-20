package proxy;

import af.co.design.utils.Log;
import decorator.Source;
import decorator.Sourceable;
/**
 * 代理模式
 * @author ZhangPeng-PC
 *
 */
public class Proxy implements Sourceable {

	private Sourceable sourceable;

	public Proxy() {
		sourceable = new Source();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		sourceable.method();
		after();
	}

	private void before() {
		Log.d("Before Proxy...");
	}

	private void after() {
		Log.d("After Proxy...");
	}

}
