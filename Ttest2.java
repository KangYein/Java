public class Ttest2 {

	public static void main(String[] args) {
		String a="Hello",b="hello",c="Hello!";
		System.out.println(a.equals(b));//������ ���� �������� ��
		System.out.println(a.replace("l","L"));//��ġ�ϴ� ���ڸ� ù��° �ѹ� ����
		System.out.println(a.replaceAll("L","l"));//Ư�� ���ڸ� ��� �ٸ� ���ڷ� �ٲ�
		System.out.println(a.replaceFirst("l","L"));//ó�� ������ l�� L�� �ٲ���
		System.out.println(b.substring(0,4));//�������� 0��°:h 4���� ����
		System.out.println(b.toUpperCase());//��� �ҹ��ڸ� �빮�ڷ�
		System.out.println(b.toLowerCase());//��� �빮�ڸ� �ҹ��ڷ�
		System.out.println(c.charAt(1));//�ε��� ��Ҹ� ��ȯ
		System.out.println(c.concat("bit21"));//�Ű������� ������ ���ڿ��� ��ħ
		System.out.println(a.length());//���ڿ��� ���̸� ��ȯ
	}

}