package sub3;
/*
 *  날짜 2020 05 14
 * 	이름 박수오
 * 	내용 자바 예외 떠넘기기  실습하기 교재  p440
 *
 */
public class ThrowsTest {
	public static void main(String[] args) throws Exception  {
		
		Calc c = Calc.getInstance();
		
		
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(2, 3);
		int r4 = c.div(4, 1);
		
		//throws 가 선언된 에러가 발생할 메서드(div)를 호출는쪽에서는 예외처리를 해야함
		//또는 다시 throws 선언으로 main을 호출하는 자바 JVM으로 예외를 던짐
//		int r4 = 0;
//		try {
//			r4 = c.div(4, 1);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		System.out.println("r1 :"+r1 );
		System.out.println("r2 :"+r2 );
		System.out.println("r3 :"+r3 );
		System.out.println("r4 :"+r4 );
		
		System.out.println("종료...");
	}
}
