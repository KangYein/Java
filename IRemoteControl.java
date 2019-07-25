/**
IRemoteControl 인터페이스
**/
interface IRemoteControl{
	void powerOn();//추상 메서드
	void powerOff();//추상 메서드
	void channelUp();//추상 메서드
	void channelDown();//추상 메서드
	/*
	public abstract void powerOn();//추상 메서드
	public abstract void powerOff();//추상 메서드
	public abstract void channelUp();//추상 메서드
	public abstract void channelDown();//추상 메서드
	*/
}//end of IRemoteControl interface

/**
인터페이스를 전부 구현하지 않아서 다시 추상 클래스가 되는 예제
**/
abstract class RemoteTV implements IRemoteControl {
	protected int nChannel =0;
	protected boolean bPower = false;
	public void powerOn() {//추상 메서드 재정의
		bPower =true;
		System.out.println("TV 전원 On!");
	}
	public void powerOff() {//추상 메서드 재정의
		bPower =false;
		System.out.println("TV 전원 Off!");
	}
	public void channelUp() {//추상 메서드 재정의
		nChannel++;
		System.out.println("TV Channel Up"+nChannel);
	}
}//end of RemoteTV abstract class
/**
추상 클래스를 구현하는 예
**/