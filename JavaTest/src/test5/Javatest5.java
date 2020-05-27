package test5;

public class Javatest5 {
	public static void main(String[] args) {
		
		int x = 4;
		int y = 2;
		int z;
		
		z = x + y;
		System.out.println("x + y =" +z);
		
		z = x - y;
		System.out.println("x - y =" +z);
		
		z = x * y;
		System.out.println("x * y =" +z);
		
		z = x / y;
		System.out.println("x / y =" +z);
		
		z = (x + y) * (x - y);
		System.out.println(" (x + y) * (x - y)=" +z);
		
		z =  (x * y) + (x / y);
		System.out.println("(x * y) + (x / y) =" +z);
	}
}
