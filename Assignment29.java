package assignment;

public class Assignment29 {

		     void add(int a,int b) {
		    	 System.out.println(a+b);
		     }
	         void sub(int a,int b) {
	        	 System.out.println(a-b);
	         }
	         void multi(int a,int b) {
	        	 System.out.println(a*b);
	         }
	         void div(int a,int b) {
	        	 System.out.println(a/b);
	         }
	         void mod(int a,int b) {
	        	 System.out.println(a%b);
	         }
	         
	         
		public static void main(String[] args) {
			Assignment29 a1=new Assignment29();
			a1.add(10,20);
			a1.div(20,10);
			a1.multi(10,20);
			a1.mod(20,10);
			a1.sub(20,10);
	}

}
