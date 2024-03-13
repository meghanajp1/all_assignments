package assignment;

public class Assignment19 {
	Assignment19(){
		System.out.println("1");
	}
Assignment19(int a){
		System.out.println("2");
	}
Assignment19(double b){
	System.out.println("3");
}
Assignment19(long m){
	System.out.println("4");
}
Assignment19(long a,char i){
	System.out.println("5");
}
Assignment19(char a){
	System.out.println("6");
}
Assignment19(int m,int n){
	System.out.println("7");
}
Assignment19(double e,double f){
	System.out.println("8");
}
Assignment19(int s,double f){
	System.out.println("9");
}
Assignment19(double r,char m){
	System.out.println("10");
}
	public static void main(String[] args) {
		Assignment19 t1 = new Assignment19();
		 new Assignment19(10);
		 new Assignment19(26.5);
		 new Assignment19(1234567890l);
		 new Assignment19(1334567890l,'m');
		 new Assignment19('m');
		 new Assignment19(10,20);
		 new Assignment19(10.5,20.5);
		 new Assignment19(10,20.5);
		 new Assignment19(10.5,'m');
		 
		}
	}


