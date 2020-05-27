package sub3;

public class Parent extends Grandparent {
	
	
	@Override
	public final void method1() {
		System.out.println("parent - method1 ...");
	}
	
	//overloading
	public void method2(int a) {
		System.out.println("parent - method2 ...");
	}
	
	@Override
	public void method3() {
		System.out.println("parent - method3 ...");
	}
	
	
	
}
