import java.util.Scanner;

public class ArrayTest {
	final static int STUDENT =5;
	public static void main(String[] args) {
		int[] scores=new int[STUDENT];
		getValue(scores);
		getAverage(scores);
	}
	private static void getValue(int[] array) {
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			System.out.println("������ �Է��Ͻÿ�.:");
			array[i]=sc.nextInt();
		}
		sc.close();
	}
	private static void getAverage(int[] array) {
		int total=0;
		for(int i=0;i<array.length;i++) {
			total+=array[i];
		}
		System.out.println("���:"+total/array.length);
	}
}