class Watch{
	private String brand;
	private int watch_number;
	//�Ű������� �ִ� ������
	public Watch(String brand) {
		this.brand=brand;
		watch_number++;//static ������ ���
	}
	//�Ϲ� �żҵ�
	public void ToString() {
		System.out.println(brand+" "+watch_number);
	}
}
public class WatchTest1 {
	public static void main(String[] args) {
		Watch watch1 =new Watch("ARMANI");
		watch1.ToString();
		Watch watch2 =new Watch("���ÿ�ġ");
		watch2.ToString();

	}

}