package test06;

class rent {
	public void payment() {
		System.out.println("�Ӵ�Ḧ �޽��ϴ�.");
	}
}

class Landload extends rent {
	
	public void getMoney() {
		System.out.println("�ǹ��� �Դϴ�.");
		payment();
	}
}


public class test06 {
	public static void main(String[] args) {
		
		Landload master = new Landload();
		master.getMoney();
	}
	

}
