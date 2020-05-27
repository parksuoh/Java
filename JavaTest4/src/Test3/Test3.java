package Test3;

public class Test3 {
	public static void main(String[] args) {
		
		String fileName = "자바 수행평가.hwp";
		
		int idx = fileName.???????;
				
		String title = fileName.??????(0,idx);
		String ext   = fileName.??????(idx+1);
		
		System.out.println("파일명 : "+title);
		System.out.println("확장자 : "+ext);
	}
}
