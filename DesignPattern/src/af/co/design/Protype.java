package af.co.design;

/**
 * 原型
 * 
 * @author ZhangPeng-PC
 * 
 */
public class Protype implements Cloneable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		Protype proto = (Protype) super.clone();
		return proto;
	}

}
