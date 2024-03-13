package assignment;

abstract class  Meghana{
	abstract void add();
	abstract void subtract();
	void multi() {
		System.out.println("multi");
	}
}

public class Assignmet37 extends Meghana {
	void method() {
		System.out.println("method");
	}
	
	public static void main(String[] args) {
		Assignmet37 a1 = new Assignmet37();
		a1.add();
		a1.multi();
		a1.subtract();
		a1.method();
		
	}

	
	void add() {
		System.out.println("hello");		
	}


	
	void subtract() {
		System.out.println("chethan");		
	}

}
