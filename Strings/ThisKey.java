package Strings;
class School{
	int rollnum;
	String name;
	float fee;
	public School(int rollnum, String name, float fee) {
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.fee = fee;
	}
	void display() {
		System.out.println(rollnum+" "+name+" "+fee);
	}
}

public class ThisKey {

	public static void main(String[] args) {
		School s1=new School(111,"ankit",5000f);  
		School s2=new School(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
		

	}

}
