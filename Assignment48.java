package assignment;

public class Assignment48 {
   public static void main(String[] args) {
		//In a string "mango" calculate how many are alpha and how many are numeric
		String name = "mango";
		char c1[]=name.toCharArray();
		int countofalpha=0;
		int countofnum=0;
		
		
		for(int i =0;i<name.length();i++) {
			
		boolean ans = Character.isAlphabetic(c1[i]);
	
		boolean ans2=Character.isDigit(c1[i]);
	
	if(ans==true) {
		//System.out.println("the position"+i+" "+"is alpha");
		countofalpha++;
	}
	if(ans2==true) {
		//System.out.println("the position"+i+" "+"is digit");
		countofnum++;
			}
	
	}
		System.out.println(countofalpha);
	
		System.out.println(countofnum);
		
}	
}


