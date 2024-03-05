package assignment;

public class Containspace {

	public static void main(String[] args) {
		
		String name = "megha na";
	char c1[]=name.toCharArray();
	for(int i =0;i<name.length();i++) {
	boolean ans =	Character.isSpaceChar(c1[i]);
	   
	     if(ans==true) {
   	 System.out.println("space is present");
	     }
	}
	}

}
