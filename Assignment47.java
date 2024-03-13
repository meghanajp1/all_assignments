package assignment;

public class Assignment47 {
   public static void main(String[] args) {
		
		String name = "mango 123";
		char c1[]=name.toCharArray();
		int countofalpha=0;
		int countofnum=0;
		int countofspace=0;
		//System.out.println(Arrays.toString(c1));
		for(int i =0;i<name.length();i++) {
			
		boolean ans = Character.isAlphabetic(c1[i]);
		boolean ans1=Character.isSpaceChar(c1[i]);
		boolean ans2=Character.isDigit(c1[i]);
			if(ans1==true) {
		//System.out.println("the position "+i+"is space");
		countofspace++;
	}
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
		System.out.println(countofspace);
		System.out.println(countofnum);
		
}	
}


