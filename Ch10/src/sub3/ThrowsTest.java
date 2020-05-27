package sub3;
/*
 *  ��¥ 2020 05 14
 * 	�̸� �ڼ���
 * 	���� �ڹ� ���� ���ѱ��  �ǽ��ϱ� ����  p440
 *
 */
public class ThrowsTest {
	public static void main(String[] args) throws Exception  {
		
		Calc c = Calc.getInstance();
		
		
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(2, 3);
		int r4 = c.div(4, 1);
		
		//throws �� ����� ������ �߻��� �޼���(div)�� ȣ����ʿ����� ����ó���� �ؾ���
		//�Ǵ� �ٽ� throws �������� main�� ȣ���ϴ� �ڹ� JVM���� ���ܸ� ����
//		int r4 = 0;
//		try {
//			r4 = c.div(4, 1);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		System.out.println("r1 :"+r1 );
		System.out.println("r2 :"+r2 );
		System.out.println("r3 :"+r3 );
		System.out.println("r4 :"+r4 );
		
		System.out.println("����...");
	}
}
