package sub3;
/*
 *  ��¥ 2020 05 13
 * 	�̸� �ڼ���
 * 	���� �ڹ� �������̽� �ǽ��ϱ� 
 */
public class InterfaceTest3 {
	public static void main(String[] args) {
		
		//�������̽� ����: ��ü���� ���յ��� ���ߴ� ����
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.swichOn();
		socket.swichOff();
		
		
	}
}
