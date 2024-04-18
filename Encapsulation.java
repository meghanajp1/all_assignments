package test1;
class sensitiveinfo {
	
	
	   private String un ="user@gmail.com";
		
	

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}
}


public class Encapsulation {

	public static void main(String[] args) {
		
		sensitiveinfo s1 =new sensitiveinfo();
		s1.setUn("meghanajp@gmail.com");
		System.out.println(s1.getUn());
			
		
		
	}

}
