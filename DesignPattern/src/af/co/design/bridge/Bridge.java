package af.co.design.bridge;

import af.co.design.decorator.Sourceable;

/**
 * 桥接
 * 
 * @author ZhangPeng-PC
 * 
 */
public abstract class Bridge {

	private Sourceable source;

	public void method() {
		source.method();
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}
}
