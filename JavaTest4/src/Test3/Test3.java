package Test3;

public class Test3 {
	public static void main(String[] args) {
		
		String fileName = "�ڹ� ������.hwp";
		
		int idx = fileName.???????;
				
		String title = fileName.??????(0,idx);
		String ext   = fileName.??????(idx+1);
		
		System.out.println("���ϸ� : "+title);
		System.out.println("Ȯ���� : "+ext);
	}
}
