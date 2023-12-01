package ClassObject;
class Addition{
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
}

public class OverLoading {

	public static void main(String[] args) {
		System.out.println(Addition.add(12, 13));
		System.out.println(Addition.add(12, 13, 14));
		

	}

}
