package LogicalCoding;

public class SplitString {

	public static void main(String[] args) {
		String str="Java is a programming and high level language";
		String[]words=str.split("\\s");
		for(String w:words) {
			System.out.println(w);
		}

	}

}
