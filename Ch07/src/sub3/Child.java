package sub3;

public class Child extends Parent {

	/*
	 *부모클래스 method1에 final 선언으로Override를 할 수 없다.
	public void method1() {
		System.out.println("Child - method1 ...");
	}
	*/
	
	@Override
	public void method2() {
		System.out.println("Child - method2 ...");
	}
	
	//overloading
	public void method3(int a) {
		System.out.println("Child - method3 ...");
	}
	
	
	
}
