package sub1;

import sub1.Outer.Inner;

/*
 *  날짜 2020 05 14
 * 	이름 박수오
 * 	내용 자바 중첩 실습하기 
 *
 */
public class InnerTest {
	public static void main(String[] args) {
		
		Outer out = new Outer(10);
		out.info();
		
		Inner inner = out.new Inner(20);
		inner.info();
	}
}
