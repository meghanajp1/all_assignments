package assignment;

public class Assignment36 {
	int age;
	int salary;
	String name;
	void add(int age,int salary,String name) {
		this.age=age;
		this.salary=salary;
		this.name=name;
		
	}


	public static void main(String[] args) {
		Assignment36 t =new Assignment36();
		t.add(12, 10000, "meghana");
		System.out.println(t.age);

		
		
	}

}
