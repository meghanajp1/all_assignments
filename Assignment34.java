package assignment;

class Supercalling2 {
	
	Supercalling2(int a){
		
	
		System.out.println("hello");
	}
}

class Supercalling3 extends Supercalling2{
	
	 Supercalling3(int b){
		 super(10);
		System.out.println("meghana");
	}
}
	
	
	public class Assignment34 extends Supercalling3 {
		Assignment34() {
			super(30);
			System.out.println("sangeetha");		}

				
	    public static void main(String[] args) {
			new Assignment34();
		
	}
		
	}