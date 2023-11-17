package Strings;

public class GetAndSet {
	private String name;
	

	public String getName() { // Getter Method
		return name;
	}


	public void setName(String name) { //setter Method
		this.name = name;
	}


	public static void main(String[] args) {
		GetAndSet getset=new GetAndSet();
		getset.setName("Program");
		System.out.println(getset.getName());

	}

}
