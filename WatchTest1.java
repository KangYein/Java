class Watch{
	private String brand;
	private int watch_number;
	//매개변수가 있는 생성자
	public Watch(String brand) {
		this.brand=brand;
		watch_number++;//static 변수로 사용
	}
	//일반 매소드
	public void ToString() {
		System.out.println(brand+" "+watch_number);
	}
}
public class WatchTest1 {
	public static void main(String[] args) {
		Watch watch1 =new Watch("ARMANI");
		watch1.ToString();
		Watch watch2 =new Watch("애플워치");
		watch2.ToString();

	}

}