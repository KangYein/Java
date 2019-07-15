public class Test6 {

	public static void main(String[] args) {
		int x=4;//0000 0100
		int y=8;//0000 1000
		System.out.println(x&y);//0000 0000
		System.out.println(x|y);//0000 1100
		System.out.println(x^y);//0000 1100
		System.out.println(~x);//1000 0101
		System.out.println(x<<5);//1000 0000
		System.out.println(y>>2);//0000 1000
		int bignum =(x>y)?x:y;
		System.out.println(bignum);

	}

}