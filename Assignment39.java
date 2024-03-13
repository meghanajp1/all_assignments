package assignment;
interface Parent1{
	
	void add();
}
interface Parent2{
	void sub();
}
interface Parent3{
	void multi();
}
interface Parent4{
	void div();
}

public class Assignment39 implements Parent1,Parent2,Parent3,Parent4 {

	public static void main(String[] args) {
		
		
		Assignment39 f1 = new Assignment39();
		f1.add();
		f1.sub();
		f1.div();
		f1.multi();
		
		
	}

	
	public void div() {
		System.out.println("division");
				
	}

	
	public void multi() {
		System.out.println("multiplication");
				
	}

	
	public void sub() {
		System.out.println("subtraction");
				
	}

	
	public void add() {
		System.out.println("addition");
				
	}

}
