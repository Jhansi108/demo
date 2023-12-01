package GetterAndSetter;

public class ParameterConst {
	String name;
	int id;
	ParameterConst(String n,int i){
		name=n;
		id=i;
		
			}
	public void print() {
		System.out.println(name +" "+id);
	}

	public static void main(String[] args) {
		ParameterConst pc=new ParameterConst("Jhansi", 11432);
		pc.print();
		
		

	}

}
