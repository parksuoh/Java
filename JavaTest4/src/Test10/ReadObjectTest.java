package Test10;

import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

public class ReadObjectTest {
	public static void main(String[] args) {
		
		try {
			//���� ������Ʈ ���� ������ apple.txt ��ü���ϰ� ��Ʈ�� ����
			FileInputStream fis = new FileInputStream("./apple.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//��Ʈ���� ���� ��ü�� ���� (������ȭ)
			Apple a1 = (Apple) ois.readObject();
			Apple a2 = (Apple) ois.readObject();
			
			a1.show();
			a2.show();
			
			//��Ʈ�� ����
			?????????;
			?????????;
			
		}catch (???????? e) {
			System.out.println("apple.txt ������ �������� �ʽ��ϴ�.");
		}catch (????? e){
			e.printStackTrace();
		}catch (????????? e) {
			e.printStackTrace();
		}
		
		
	}
}
