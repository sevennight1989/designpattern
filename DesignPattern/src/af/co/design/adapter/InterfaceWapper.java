package af.co.design.adapter;

import af.co.design.utils.Log;

public abstract class InterfaceWapper implements Targetable {

	@Override
	public void method1() {
		Log.d("InterfaceWapper method1");
	}

	@Override
	public void method2() {
		Log.d("InterfaceWapper method2");
	}

}
