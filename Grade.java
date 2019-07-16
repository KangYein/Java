import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		int grade;
		char s1,s2;
		Scanner sc =new Scanner(System.in);
		System.out.print("점수를 입력하시오:");//입력 안내 출력
		grade=sc.nextInt();//첫 번째 숫자를 읽음
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
			System.out.println("학점:"+s1+s2);
		}
		else {
			System.out.println("학점:"+s1);
		}
		sc.close();
	}

}