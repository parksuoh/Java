package Test2;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		int[] arr = {2,4,6,8,10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ã�� ���� �Է� :");
		int find = sc.nextInt();
		
		try {
			searchArray(find, arr);
			System.out.println("�ش��ϴ� ���� ã��!!!");
		}catch(NotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		
		System.out.println("���α׷� ���� ����...");
	}
	
	public static void searchArray(int find, int[] arr)throws NotFoundException {
		
		for(int i : arr) {
			if(i == find) {
				return;
			}
		}
		throw ????;
	
}