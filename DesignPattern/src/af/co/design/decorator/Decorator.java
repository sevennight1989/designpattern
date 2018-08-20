package af.co.design.decorator;

import af.co.design.utils.Log;

/**
 *代理模式
 * @author ZhangPeng-PC
 *
 */
public class Decorator implements Sourceable {
	
	private Sourceable sourceable;
	
	public Decorator(Sourceable sourceable){
		this.sourceable = sourceable;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		Log.d("Before decorator...");
		sourceable.method();
		Log.d("After decorator...");
	}

}
