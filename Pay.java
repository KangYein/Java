import java.util.Scanner;
import static java.lang.System.out;
public class Pay {

	public static void main(String[] args) {
		int pay;
		int hours;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ð��� �Է��ϼ���:");
		hours=sc.nextInt();
			if(hours>0) {
				pay= hours * 6030;
				System.out.printf("�ӱ��� %d �Դϴ�\n",pay);
				System.out.println("���ѽð�:"+hours+"�ð�");
			}
			else {
				System.out.println("�ð��� �߸� �ԷµǾ����ϴ�.");
			}
		sc.close();
		out.println("---");//import static java.lang.System.out;�� �������༭ �ٷ� �� �� ����
	}

}