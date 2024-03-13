package assignment;

public class Assignment18 {
	static void add() {
		System.out.println("add");
	}
	static void add(int a) {
		System.out.println(a);
	}
	static void add(double b) {
		System.out.println(b);
	}
	static void add(int m,double n) {
		System.out.println("mn");
	}
	
	void add(byte c) {
		System.out.println("c");
	}
	void add(long d) {
		System.out.println("d");
	}
	void add(int e,int f) {
		System.out.println("ef");
	}
	void add(double a,double b) {
		System.out.println("ab");
	}
	
//	Callnonstatic(){
//		System.out.println("constructor");
//	}

	public static void main(String[] args) {
		Callnonstatic c1 = new Callnonstatic();
		add();
		add(10);
		add(26.50);
		add(10,26.50);
		
		c1.add(10);
		c1.add(8792370637l);
		c1.add(10,20);
		c1.add(10.2,20.2);
		
	}

}
