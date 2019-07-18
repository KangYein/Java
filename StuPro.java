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
		super(a,b);//하위클래스만 가능
		this.job="학생";
	}
	public void Behavior() {
		System.out.println(name+" "+ age+"세"+job+"행동:과제중..");
	}
}
class Professor extends Person{
	
	public Professor(String a,int b) {
		super(a,b);
		this.job="교수";
	}
	public void Behavior() {
		System.out.println(name+" "+ age+"세"+job+" 행동:과제내는중..");
	}
}
 public class StuPro {

	public static void main(String[] args) {
		//상속
		Student student =new Student("문주영",24);
		Professor professor = new Professor("최세지",42);
		
		student.Behavior();
		professor.Behavior();

	}

}