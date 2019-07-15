public class Test6 {

	public static void main(String[] args) {
		int x=4;
		int y=8;
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		System.out.println(~x);
		System.out.println(x<<5);
		System.out.println(y>>2);
		int bignum =(x>y)?x:y;
		System.out.println(bignum);

	}

}