package p411;

public class Anonymous {

	//�ʵ� �ʱⰪ���� ����
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	private RemoteControl localVar;
	
	void method1() {
		RemoteControl local = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
			}
		};
		
		//���� ���� ���
		
		localVar.turnOn();
			
	}
	
	void method2(RemoteControl rc) {
		
		rc.turnOn();
	}
	
	
	
}
