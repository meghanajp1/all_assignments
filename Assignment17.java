package assignment;

public class Assignment17 {
static void add() {
	System.out.println("add");
}
	static void sub() {
		System.out.println("sub");
	}
	void add1() {
		System.out.println("add1");
	}
	void sub1() {
		System.out.println("sub1");
	}
	
	Assignment17(){
		System.out.println("constructor");
	}
	
	
	public static void main(String[] args) {
		//Write a program with 2 Static method,2 Non-Static method,and one Constructor
		Assignment17 a1 = new Assignment17();
		a1.add1();
		a1.sub1();
		add();
		sub();
		
		
		
		
		
		
	}

}
