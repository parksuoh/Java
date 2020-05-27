package Test8;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Test8 {
	public static void main(String[] args) {
	
		???? lottoSet = new HashSet<????>();
		
		for(;;) {
			int num = (int) Math.ceil(Math.random()*45);
			
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		//로또번호 정렬
		????? treeSet = new TreeSet<>(lottoSet);
		
		//로또번호 출력
		
		??????? iter = treeSet.iterator();
		
		while(???????) {
			System.out.println(iter.next()+" ");
		}
		
		
		
	}
	
	
}
