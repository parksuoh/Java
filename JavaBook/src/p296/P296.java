package p296;

public class P296 {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("������ : " +calculator.arearCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("������ : "+computer.arearCircle(r));
	}
}
