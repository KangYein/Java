import java.util.Scanner;//Scanner Ŭ���� ����

public class Add {//main �޼ҵ忡�� ������ ����
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);//����ڷκ��� �Է��� �ޱ� ���ؼ� Scanner  ��ü�� ����
		int x=5;//���� ����(����:ù ��° ���ڸ� ����)
		int y=0;//���� ����(����:�� ��° ���ڸ� ����)
		int sum;//���� ����(����:���� ��Ÿ��)
		System.out.print("ù ��° ���ڸ� �Է��Ͻÿ�:");//�Է� �ȳ� ���
		x=input.nextInt();//ù ��° ���ڸ� ����
		System.out.print("�� ��° ���ڸ� �Է��Ͻÿ�:");//�Է� �ȳ� ���
		y=input.nextInt();//�� ��° ���ڸ� ����
		sum=x/y;//�������� ��� ->���� ���� �߻�
		System.out.println(sum);
		System.out.println("���� �� ="+x/y);//->�� ���� �߻�
		input.close();
	}//�޼ҵ��� ��

}//Ŭ������ ��