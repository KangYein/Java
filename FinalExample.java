import java.util.Scanner;

public class FinalExample {

	public static void main(String[] args) {
		final double PI =3.14159;
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ���:");
		int radius =sc.nextInt();
		double circum = 2*radius*PI;
		double area = radius*radius*PI;
		System.out.println("���� �ѷ���"+circum);
		System.out.println("���� ���̴�"+area);
		
		sc.close();
	}

}