import java.util.Scanner;//Scanner 클래스 포함

public class Add {//main 메소드에서 실행이 시작
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);//사용자로부터 입력을 받기 위해서 Scanner  객체를 생성
		int x=5;//변수 선언(목적:첫 번째 숫자를 저장)
		int y=0;//변수 선언(목적:두 번째 숫자를 저장)
		int sum;//변수 선언(목적:합을 나타냄)
		System.out.print("첫 번째 숫자를 입력하시오:");//입력 안내 출력
		x=input.nextInt();//첫 번째 숫자를 읽음
		System.out.print("두 번째 숫자를 입력하시오:");//입력 안내 출력
		y=input.nextInt();//두 번째 숫자를 읽음
		sum=x/y;//나눗셈을 출력 ->실행 오류 발생
		System.out.println(sum);
		System.out.println("나눈 값 ="+x/y);//->논리 오류 발생
		input.close();
	}//메소드의 끝

}//클래스의 끝