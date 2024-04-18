package test1;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatch {

	public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
	     int a =	sc.nextInt();
	        int name = 1/a;
		System.out.println(name);
	}
	catch(ArithmeticException a) {
		System.out.println("hi");
	}
	catch (InputMismatchException b) {
		System.out.println("hello");
	}
	catch(ArrayIndexOutOfBoundsException c) {
		System.out.println("name");
	}
     finally {
    	 System.out.println("finally");
     }

	
	}
}


