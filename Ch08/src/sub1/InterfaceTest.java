package sub1;
/*
 *  날짜 2020 05 13
 * 	이름 박수오
 * 	내용 자바 인터페이스 실습하기 
 *
 */
public class InterfaceTest {
	public static void main(String[] args) {
		//인터페이스 역할: 클래스 설계의 표준 가이드 역할
		
		
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chDown();
		lg.soundUp();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chUp();
		samsung.soundDown();
		
		
	}
}
