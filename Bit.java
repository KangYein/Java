
import java.util.ArrayList;

public class Bit {

	public static void main(String[] args) {
		String mclass[]= {"��Ʈ","�ڹ�","����"};
		for(String s:mclass) {	//foreach���� ����Ͽ� �迭�� �б�
			System.out.println(s);
		}
		for(int i=0;i<mclass.length;i++) {	//for���� ����Ͽ� �迭�� �б�
			System.out.println(mclass[i]);
		}
		ArrayList<Integer> mclass1 =new ArrayList<Integer>();//import java.util.ArrayList;�� �־�� ��
		mclass1.add(2015);
		mclass1.add(11);
		mclass1.add(18);
		for(Integer i:mclass1) {	//foreach���� ����Ͽ� �÷����� �б�
			System.out.println(i);
			System.out.println(mclass1);
		}
	}
}