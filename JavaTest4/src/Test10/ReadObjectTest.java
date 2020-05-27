package Test10;

import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

public class ReadObjectTest {
	public static void main(String[] args) {
		
		try {
			//현재 프로젝트 폴더 하위에 apple.txt 객체파일과 스트림 연걸
			FileInputStream fis = new FileInputStream("./apple.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//스트림을 통한 객체를 복원 (역질렬화)
			Apple a1 = (Apple) ois.readObject();
			Apple a2 = (Apple) ois.readObject();
			
			a1.show();
			a2.show();
			
			//스트림 해제
			?????????;
			?????????;
			
		}catch (???????? e) {
			System.out.println("apple.txt 파일이 존재하지 않습니다.");
		}catch (????? e){
			e.printStackTrace();
		}catch (????????? e) {
			e.printStackTrace();
		}
		
		
	}
}
