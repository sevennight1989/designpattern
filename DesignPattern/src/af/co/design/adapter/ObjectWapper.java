package af.co.design.adapter;

import af.co.design.utils.Log;
/**
 * 对象的适配
 * @author ZhangPeng-PC
 *
 */
public class ObjectWapper implements Targetable {
	private Source source;
	public ObjectWapper(Source source){
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		Log.d("ObjectWapper method2");
	}

}
