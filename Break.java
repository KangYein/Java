public class Break {

	public static void main(String[] args) {
		int sum =0;
		int i=0;
		
		while(true) {
			if(sum>100) {
				sum-=i;
				--i;
				break;
			}
			i++;
			sum+=i;
		}
		System.out.println("i=:"+i);
		System.out.println("sum=:"+sum);
	}
}