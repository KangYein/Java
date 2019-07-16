import java.util.Scanner;

public class Fat {

	public static void main(String[] args) {
		double weight,height;
		double BMI;
		Scanner sc =new Scanner(System.in);
		System.out.println("체중(kg):");
		weight=sc.nextDouble();
		System.out.println("키(m):");
		height=sc.nextDouble();
		BMI=weight/(height*height);
		if(BMI<18.5||BMI>23) {
			if(BMI>23&&BMI<25) {
				System.out.println("과체중입니다.");
			}
			else if(BMI>25) {
				System.out.println("비만입니다.");
			}
			else {
				System.out.println("저체중입니다.");
			}
		}
		else {
			System.out.println("정상입니다.");
		}
		sc.close();
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                

}