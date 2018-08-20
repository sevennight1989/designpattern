package af.co.design;

import af.co.design.AbstractFactory.Food;

public class Main {
	public static void main(String[] args) {
		FactoryMethod.Food f = get("B");
		if (f != null) {
			f.printFood();
		}
		Food food = getA();
		food.printFood();
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
	
	private static AbstractFactory.Food getA(){
		Food food = new AbstractFactory.FactoryForA().get();
		return food;
	}

}
