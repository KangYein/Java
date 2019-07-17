import java.util.Random;

public class PackageTest {

	public static void main(String[] args) {
		int[] array=new int[10];
		int rannum =0;
		boolean check;
		Random myrandom = new Random();
		for(int i=0;i<array.length;i++) {
			rannum = myrandom.nextInt(10);
			check = true;
			for(int j =0; j<i;j++) {
				if(array[j]==rannum) {
					i--;
					check =false;
				}
			}
			if(check) {
				array[i]=rannum;
			}
		}
		for(int i =0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}System.out.println();

	}

}