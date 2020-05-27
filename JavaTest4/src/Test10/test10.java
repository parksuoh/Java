package Test10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class test10 {
	public static void main(String[] args) throws ???? {
		
		Apple apple1 = new Apple("한국", 3000);
		Apple apple2 = new Apple("미국", 3000);
		
		FileOutStream      fos = new FileOutputStream("./apple.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//현재 프로젝트 폴더 하위에 apple.txt 객체파일 생성(직렬화)
		oos.writeObject(apple1);
		oos.writeObject(apple2);
		
		//스트림 해제
		?????;
		?????;
		
		System.out.println("현재 폴더에 apple.txt 객체파일 생성 완료!");
		
	}
}
