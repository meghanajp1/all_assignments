package assignment;

public class Assignment41 {

	public static void main(String[] args) {
		String name = "madam";
		String rev="";
		for(int i =0;i<name.length();i++) {
			rev = rev +name.charAt(i);
			
		}
		System.out.println(rev);
		if(name.equals(rev)) {
			System.out.println("the given string is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

	
	

	
	}

