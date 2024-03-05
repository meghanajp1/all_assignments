package assignment;

public class Sunmoon {

	public static void main(String[] args) {
		
		for(int i =1;i<=1000;i++) {
			//System.out.println(i);
			if(i%3==0) {
				System.out.println("sun"+i);
			}
			if(i%5==0) {
				System.out.println("moon"+i);
			}
			if(i%3==0||i%5==0) {
				System.out.println("sunmoon"+i);
			}
			
		}
	}

}
