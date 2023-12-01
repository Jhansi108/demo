package GetterAndSetter;
class Student{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class GetSetPro {

	public static void main(String[] args) {
		Student stu=new Student();
		stu.setName("Jhansi");
		System.out.println(stu.getName());
		

	}

}
