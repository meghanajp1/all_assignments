
public class Typecasting {

	public static void main(String[] args) {
		double wt = 32;
		System.out.println(wt);
		
		
//		double weight=(double)50;----------explicitway
//        System.out.println(weight);
//        
//        int weight1 = (int)50.0;
//        System.out.println(weight1);
//        
//        byte a = 32;
//        long w1 = (long)(a);
//        System.out.println(w1);
        
        int a = (int)(86.06);//narrowing can be done only in explicit way 
        System.out.println(a);
        
        long q1 =334455667788l;
        byte w2 =(byte)(q1);
        System.out.println(w2);
        
	}

}
