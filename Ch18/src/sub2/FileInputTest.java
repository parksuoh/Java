package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 	날짜  2020 05 21
 * 	이름  박수오
 * 	내용 자바 파일 입출력 실습하기 p1018
 * 
 */
public class FileInputTest {
	public static void main(String[] args) {
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
	
		try {
			FileInputStream fis = new FileInputStream(file);
			int value = 0;
			while (true) {
				value = fis.read();
				if(value == -1) {
					//더이상 불러올 데이터가 없을경우
					break;
				}
				char c = (char) value;
				System.out.print(c);
				
			}
			//입력스트림 해제
			fis.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n프로그램 종료...");
		
		
	}
}
