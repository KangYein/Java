class This {
	int i;
	double d;
	
	public This(int i) {
		this(3.14);//double형 매개변수를 갖는 생성자를 호출
		System.out.println(i);
	}
	public This(double d) { 
		System.out.println(d);
	}
	public static void main(String[] args) {
		This t= new This(100);

	}

}
