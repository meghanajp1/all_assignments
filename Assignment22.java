package assignment;

public class Assignment22 {
	final static double pi =3.14;
//	//"Write a program to find 
//	Area of Circle,Triangle,
//	Rectangle,Square,
//	Trapezium
	
	public static void main(String[] args) {
		int r = 20;
		int base =10;
		int height =20;
		double areaofcircle = pi*r*r;
		double areaoftriangle = 0.5*base*height;
		int a = 30;
		int b =40;
		double areaoftrapezium = 0.5*height*(a+b);
		
		int areaofsquare= base*base;
		int areaofrectangle=base * height;
		System.out.println(areaofcircle);
		System.out.println(areaoftriangle);
		System.out.println(areaofsquare);
		System.out.println(areaofrectangle);
		System.out.println(areaoftrapezium);
		
		
		
		
	}

}
