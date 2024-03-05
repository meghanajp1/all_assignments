package assignment;

public class Tenconstructor {
	Tenconstructor(){
		System.out.println("1");
	}
Tenconstructor(int a){
		System.out.println("2");
	}
Tenconstructor(double b){
	System.out.println("3");
}
Tenconstructor(long m){
	System.out.println("4");
}
Tenconstructor(long a,char i){
	System.out.println("5");
}
Tenconstructor(char a){
	System.out.println("6");
}
Tenconstructor(int m,int n){
	System.out.println("7");
}
Tenconstructor(double e,double f){
	System.out.println("8");
}
Tenconstructor(int s,double f){
	System.out.println("9");
}
Tenconstructor(double r,char m){
	System.out.println("10");
}
	public static void main(String[] args) {
		Tenconstructor t1 = new Tenconstructor();
		 new Tenconstructor(10);
		 new Tenconstructor(26.5);
		 new Tenconstructor(1234567890l);
		 new Tenconstructor(1334567890l,'m');
		 new Tenconstructor('m');
		 new Tenconstructor(10,20);
		 new Tenconstructor(10.5,20.5);
		 new Tenconstructor(10,20.5);
		 new Tenconstructor(10.5,'m');
		 
		}
	}


