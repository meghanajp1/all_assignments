package assignment;

import java.util.Arrays;

public class Spiltfun {

	
		public static void main(String[] args) {
			String name  ="meghana chethan belur srinivasu";
			String[] name1 = name.split(" ");
			System.out.println(Arrays.toString(name1));

			for(int i =name1.length-1;i>=0;i--)
				
			
			{
				System.out.print(name1[i]+" ");
				
			}
			
		
			}
		
	}


