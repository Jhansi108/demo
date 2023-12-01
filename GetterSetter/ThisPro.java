package GetterAndSetter;

public class ThisPro {
	String name;
	int age;
	
	
	ThisPro(String name,int age){
		this.age=age;
		this.name=name;
		
		
	}
	
		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void details() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println();
	}

		public static void main(String[] args) {
			ThisPro p=new ThisPro("key", 5);
			p.details();
		

	}

}
