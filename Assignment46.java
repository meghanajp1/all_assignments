package assignment;

import java.util.Arrays;

public class Assignment46 {

	public static void main(String[] args) {
		String name1 ="night";
		String name2 ="thing";
		if(name1.length()!=name2.length()) {
			System.out.println("the given string are not anagram");
		}
		else {
			char c1[]=name1.toCharArray();
			char c2[]=name2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(c1);
			System.out.println(c2);
			boolean ans =Arrays.equals(c1, c2);
			System.out.println(ans);
			if(ans==true) {
				System.out.println("given string is anagram");
				

			}
			
		}
		
				
		
	}

}
