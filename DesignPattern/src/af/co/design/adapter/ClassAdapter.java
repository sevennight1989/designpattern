package af.co.design.adapter;

import af.co.design.utils.Log;

/**
 * 类的适配器
 * @author ZhangPeng-PC
 *
 */
public class ClassAdapter extends Source implements Targetable{

	@Override
	public void method2() {
		Log.d("ClassAdapter method2");
	}

}
