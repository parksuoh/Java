package Test1;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		int answer = (int) (Math.random()*10)+1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("----------------");
			System.out.println("answer�� ���� ���纸����.");
			System.out.print("1~10 ������ ���� �Է�: ");
			
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				
				if(input < 0) {
					throw new Exception ("������ �Է� �� �� �����ϴ�.");
				}
			}catch(NumberFormatException e) {
				System.out.println("���ڰ� �ƴմϴ�. ���ڸ� �Է��ϼ���.");
			}catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
				if(answer > input) {
					System.out.println("�� ū ���� �Է��ϼ���.");
				}else if(answer < input) {
					System.out.println("�� ���� ���� �Է��ϼ���.");
				}else {
					System.out.println("answer : "+answer);
					System.out.println("�����Դϴ�.");
					System.out.println("�õ� Ƚ�� : "+count + "ȸ");
					break;
				}
		}while(true);
		
		System.out.println("���α׷��� ���� ���� �Ǿ����ϴ�.");
		
		
	}
}
