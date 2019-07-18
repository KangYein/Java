import java.util.Calendar;
class Watch{
	private String brand;
	private int hour;
	private int minute;
	private int second;
	//디폴트 생성자
	public Watch() {
	}
	//매개변수가 있는 생성자
	public Watch(String brand, int hour, int minute, int second) {
		this.brand = brand;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		ToString();
	}
	//매개변수가 있는 생성자
	public Watch(String brand) {
		Calendar calendar =Calendar.getInstance();
	
		setTime(brand,calendar.get(calendar.HOUR),
				calendar.get(calendar.MINUTE),calendar.get(calendar.SECOND));
	//	ToString(); 있으면 한번 더 찍
	}
	public void setTime(String brand, int hour, int minute, int second) {
		this.brand = brand;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		ToString();
	}
	
	//일반 메소드
	public void ToString() {
		System.out.println(brand+" "+hour+" "+minute+" "+second);
	}
}
public class WatchTest{
	public static void main(String[] args) {
		Watch watch1 = new Watch("ARMANI",1,30,50);
		Watch watch2 = new Watch("Burberry");//현재 시,현재 분,현재 초
	}
}
