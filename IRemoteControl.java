/**
IRemoteControl �������̽�
**/
interface IRemoteControl{
	void powerOn();//�߻� �޼���
	void powerOff();//�߻� �޼���
	void channelUp();//�߻� �޼���
	void channelDown();//�߻� �޼���
	/*
	public abstract void powerOn();//�߻� �޼���
	public abstract void powerOff();//�߻� �޼���
	public abstract void channelUp();//�߻� �޼���
	public abstract void channelDown();//�߻� �޼���
	*/
}//end of IRemoteControl interface

/**
�������̽��� ���� �������� �ʾƼ� �ٽ� �߻� Ŭ������ �Ǵ� ����
**/
abstract class RemoteTV implements IRemoteControl {
	protected int nChannel =0;
	protected boolean bPower = false;
	public void powerOn() {//�߻� �޼��� ������
		bPower =true;
		System.out.println("TV ���� On!");
	}
	public void powerOff() {//�߻� �޼��� ������
		bPower =false;
		System.out.println("TV ���� Off!");
	}
	public void channelUp() {//�߻� �޼��� ������
		nChannel++;
		System.out.println("TV Channel Up"+nChannel);
	}
}//end of RemoteTV abstract class
/**
�߻� Ŭ������ �����ϴ� ��
**/