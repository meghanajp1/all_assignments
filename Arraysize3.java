package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysize3 {

	public static void main(String[] args) {
		int[] age = new int[3];
		
		
		
		Scanner sc =new Scanner(System.in);
	for(int i =0;i<age.length;i++) {
		age[i]= sc.nextInt();
	}
		
		System.out.println(Arrays.toString(age));
		
	}

}
