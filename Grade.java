import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		int grade;
		char s1,s2;
		Scanner sc =new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�:");//�Է� �ȳ� ���
		grade=sc.nextInt();//ù ��° ���ڸ� ����
		if(grade>=90){
			s1='A';
		}
		else if(grade>=80){
			s1='B';
		}
		else if(grade>=70){
			s1='C';
		}
		else if(grade>=60){
			s1='D';
		}
		else {
			s1='F';
		}
		if(grade>=60) {
			if(grade%10>=5||grade==100) {
				s2='+';
			}
			else {
				s2='0';
			}
			System.out.println("����:"+s1+s2);
		}
		else {
			System.out.println("����:"+s1);
		}
		sc.close();
	}

}