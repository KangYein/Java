class Person {
	String name;
	int age;
	String job;
	public Person(String name, int age) {
		//super(name,age);
		this.age = age;
		this.name = name;
	}
}

class Student extends Person{
	
	public Student(String a,int b) {
		super(a,b);//����Ŭ������ ����
		this.job="�л�";
	}
	public void Behavior() {
		System.out.println(name+" "+ age+"��"+job+"�ൿ:������..");
	}
}
class Professor extends Person{
	
	public Professor(String a,int b) {
		super(a,b);
		this.job="����";
	}
	public void Behavior() {
		System.out.println(name+" "+ age+"��"+job+" �ൿ:����������..");
	}
}
 public class StuPro {

	public static void main(String[] args) {
		//���
		Student student =new Student("���ֿ�",24);
		Professor professor = new Professor("�ּ���",42);
		
		student.Behavior();
		professor.Behavior();

	}

}