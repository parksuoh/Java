package sub2;
/*
 *  날짜 2020	05 07
 * 	이름 박수오
 *  내용 자바 클래스 실습하기
 * 
 */

public class ClassTest {
	
	
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		
		
		//국민은행 객체생성 및 초기화
		Account kb = new Account("국민은행", "121-12-1234", "김춘추", 10000);
		
		//초기화 (class에 private 사용시 못씀)
		//kb.bank = "국민은행";
		//kb.id = "121-12-1234";
		//kb.name = "김춘추";
		//kb.money = 10000;
		
		//입금, 출금하기
		kb.deposit(10000);
		kb.withdraw(5000);
		//kb.money--; //객체의 맴버변수의 캡슐화를 통한 취약코드 예방
		kb.info();
		
		//신한은행 객체생성 및 초기화
		Account sh = new Account("신한은행", "121-11-1234", "김유신", 30000);
		
		//객체 초기화
		//sh.bank = "신한은행";
		//sh.id = "121-11-1234";
		//sh.name = "김유신";
		//sh.money = 30000;
		
		//입금, 출금, 잔액확인하기
		sh.deposit(10000);
		sh.withdraw(8000);
		sh.info();
	}
	
}
