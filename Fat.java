import java.util.Scanner;

public class Fat {

	public static void main(String[] args) {
		double weight,height;
		double BMI;
		Scanner sc =new Scanner(System.in);
		System.out.println("ü��(kg):");
		weight=sc.nextDouble();
		System.out.println("Ű(m):");
		height=sc.nextDouble();
		BMI=weight/(height*height);
		if(BMI<18.5||BMI>23) {
			if(BMI>23&&BMI<25) {
				System.out.println("��ü���Դϴ�.");
			}
			else if(BMI>25) {
				System.out.println("���Դϴ�.");
			}
			else {
				System.out.println("��ü���Դϴ�.");
			}
		}
		else {
			System.out.println("�����Դϴ�.");
		}
		sc.close();
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                

}