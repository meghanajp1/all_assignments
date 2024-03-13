package assignment;

public class Assignment28 {

	public static void main(String[] args) {
		int sum =0;
		int count =0;
		double avg;
		for(int i = 1;i<=10;i++) {
			//System.out.println(i);
			sum =sum +i;
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
		avg = sum/count;
		System.out.println(avg);
	}

}
