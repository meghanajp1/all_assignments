package assignment;

public class Assignment23 {
	final double pi = 3.14;
	static int age;
	double salary=10000;
	void add(){
		age = 25;
		System.out.println(age);
		
	
	}
	void subtract() {
		int a =10;
		int b =20;
		System.out.println(b-a);
		System.out.println(b);
	}
	void areaofcircle() {
		int r =10;
		double area = pi*r*r;
		System.out.println(area);
	}

	public static void main(String[] args) {
		Assignment23 l1 =new Assignment23();
		
		System.out.println(age);
		System.out.println(l1.salary);
		l1.add();
		l1.subtract();
		l1.areaofcircle();
	}

}
