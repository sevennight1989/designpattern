package af.co.design;

/**
 * 抽象工厂
 * 
 * @author Percy
 * 
 */
public class AbstractFactory {
	
	interface Food {
		void printFood();
	}

	static class A implements Food {

		@Override
		public void printFood() {
			Log.d("Get A..");
		}
	}

	static class B implements Food {

		@Override
		public void printFood() {
			Log.d("Get B..");
		}
	}
	
	interface Produce{
		Food get();
	}
	
	 public static class FactoryForA implements Produce{

		@Override
		public Food get() {
			
			return new A();
		}
		
	}
	
	public static class FactoryForB implements Produce{

		@Override
		public Food get() {
			// TODO Auto-generated method stub
			return new B();
		}
		
	}
	
}
