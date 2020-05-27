package p407;

public class AnnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//익명 객체 필드 사용
		anony.field.wake();
		//익명 객체 로컬 변수 사용
		anony.method1();
		//익명 객체 메개값 사용
		anony.method2(
				void study() {
					System.out.println("공부합니다.");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}
			);
	}
}
