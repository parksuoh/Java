package Test6;

public class Test6 {
	public static void main(String[] args) {
		
		JavaTest6 test = new JavaTest6();
		
		Apple apple = new Apple("한국",3000);
		Banana banana = new Banana("필리핀",2000);
		Grape grape = new Grape("미국", 3000);
		
		test.showInfo(apple);
		test.showInfo(banana);
		test.showInfo(grape);
		
		
	}
	
	public void showInfo(????? fruit) {
		
		if(fruit ???? Apple) {
			Apple apple = ?????;
			apple.show();
		}else if(fruit ????? Banana) {
			Banana banana = ?????;
			banana.show();
		}else if(fruit ???? Grape) {
			Grape grape = ?????;
			grape.show();
		}
		
		
		
	}
	
	
}
