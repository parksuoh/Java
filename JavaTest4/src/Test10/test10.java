package Test10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class test10 {
	public static void main(String[] args) throws ???? {
		
		Apple apple1 = new Apple("�ѱ�", 3000);
		Apple apple2 = new Apple("�̱�", 3000);
		
		FileOutStream      fos = new FileOutputStream("./apple.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//���� ������Ʈ ���� ������ apple.txt ��ü���� ����(����ȭ)
		oos.writeObject(apple1);
		oos.writeObject(apple2);
		
		//��Ʈ�� ����
		?????;
		?????;
		
		System.out.println("���� ������ apple.txt ��ü���� ���� �Ϸ�!");
		
	}
}
