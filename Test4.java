public class Test4 {

	public static void main(String[] args) {
		System.out.println(3<4);
		System.out.println(10>20.2);
		System.out.println(12.5f<=11);
		System.out.println(7>=7);
		int num1= 5;
		int num2=2+5;
		if(num1==num2)
			System.out.println("num1과num2의 값은 동일합니다.");
		if((num1!=num2)==false)
			System.out.println("다르다고 하면 거짓말");
	}

}