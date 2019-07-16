import java.util.Scanner;
import static java.lang.System.out;
public class Pay {

	public static void main(String[] args) {
		int pay;
		int hours;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시간을 입력하세요:");
		hours=sc.nextInt();
			if(hours>0) {
				pay= hours * 6030;
				System.out.printf("임금은 %d 입니다\n",pay);
				System.out.println("일한시간:"+hours+"시간");
			}
			else {
				System.out.println("시간이 잘못 입력되었습니다.");
			}
		sc.close();
		out.println("---");//import static java.lang.System.out;을 선언해줘서 바로 쓸 수 있음
	}

}