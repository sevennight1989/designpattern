package af.co.design;

import af.co.design.adapter.ClassAdapter;
import af.co.design.adapter.ObjectWapper;
import af.co.design.adapter.Source;
import af.co.design.adapter.SourceSub1;
import af.co.design.adapter.SourceSub2;
import af.co.design.factory.AbstractFactory;
import af.co.design.factory.AbstractFactory.Food;
import af.co.design.factory.FactoryMethod;
import af.co.design.utils.Log;

public class Main {
	public static void main(String[] args) {
		FactoryMethod.Food f = get("B");
		if (f != null) {
			f.printFood();
		}
		Log.splitLine();
		Food food = getA();
		food.printFood();
		Log.splitLine();
		SingletonExt.getInstance().printMsg();
		Log.splitLine();
		Student student = new Student.StudentBuilder().setage(20)
				.setName("Tom").setNumber(18).setSex("man")
				.setSchool("YuCaizhongxue").build();
		Log.d(student.toString());
		Protype p1 = new Protype();
		p1.setName("张三");
		Protype p2 = null;
		try {
			p2 = (Protype) p1.clone();
			p2.setName("李四");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		//这里修改P2的name不会影响P1的name，如果直接使用P1赋值，或者new对象再使用P1赋值都会修改P1的name
		p2.setName("李四");
		Log.d("P1 Name: " + p1.getName());
		Log.d("P2 Name: " + p2.getName());
		Log.splitLine();
		ClassAdapter ca = new ClassAdapter();
		ca.method1();
		ca.method2();
		Log.splitLine();
		
		ObjectWapper ow = new ObjectWapper(new Source());
		ow.method1();
		ow.method2();
		Log.splitLine();
		SourceSub1 ssb1 = new SourceSub1();
		SourceSub2 ssb2 = new SourceSub2();
		ssb1.method1();
		ssb1.method2();
		ssb2.method1();
		ssb2.method2();
		

	}

	private static FactoryMethod.Food get(String name) {
		if ("A".equals(name)) {
			return FactoryMethod.StaticFactory.getA();
		} else if ("B".equals(name)) {
			return FactoryMethod.StaticFactory.getB();
		} else if ("C".equals(name)) {
			return FactoryMethod.StaticFactory.getC();
		}
		return null;
	}

	private static AbstractFactory.Food getA() {
		Food food = new AbstractFactory.FactoryForA().get();
		return food;
	}

}
