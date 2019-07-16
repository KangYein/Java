
import java.util.ArrayList;

public class Bit {

	public static void main(String[] args) {
		String mclass[]= {"비트","자바","수업"};
		for(String s:mclass) {	//foreach문을 사용하여 배열을 읽기
			System.out.println(s);
		}
		for(int i=0;i<mclass.length;i++) {	//for문을 사용하여 배열을 읽기
			System.out.println(mclass[i]);
		}
		ArrayList<Integer> mclass1 =new ArrayList<Integer>();//import java.util.ArrayList;가 있어야 함
		mclass1.add(2015);
		mclass1.add(11);
		mclass1.add(18);
		for(Integer i:mclass1) {	//foreach문을 사용하여 컬렉션을 읽기
			System.out.println(i);
			System.out.println(mclass1);
		}
	}
}