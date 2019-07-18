import java.util.Calendar;
class Watch{
	private String brand;
	private int hour;
	private int minute;
	private int second;
	//����Ʈ ������
	public Watch() {
	}
	//�Ű������� �ִ� ������
	public Watch(String brand, int hour, int minute, int second) {
		this.brand = brand;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		ToString();
	}
	//�Ű������� �ִ� ������
	public Watch(String brand) {
		Calendar calendar =Calendar.getInstance();
	
		setTime(brand,calendar.get(calendar.HOUR),
				calendar.get(calendar.MINUTE),calendar.get(calendar.SECOND));
	//	ToString(); ������ �ѹ� �� ��
	}
	public void setTime(String brand, int hour, int minute, int second) {
		this.brand = brand;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		ToString();
	}
	
	//�Ϲ� �޼ҵ�
	public void ToString() {
		System.out.println(brand+" "+hour+" "+minute+" "+second);
	}
}
public class WatchTest{
	public static void main(String[] args) {
		Watch watch1 = new Watch("ARMANI",1,30,50);
		Watch watch2 = new Watch("Burberry");//���� ��,���� ��,���� ��
	}
}
