package assignment;

class Partial {
	void add(){
		System.out.println("hello");
	}
	
}

public class Assignment35 extends Partial{
	   void add()
	{
	    	//super.add();
		System.out.println("hi");
		
	}
	

	public static void main(String[] args) {
		Assignment35 o = new  Assignment35();
		o.add();
	}

}
