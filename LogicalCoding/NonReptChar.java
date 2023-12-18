package LogicalCoding;

public class NonReptChar {

	public static void main(String[] args) {
		String str ="Eclipse Enterprise";
        boolean a = true;

        for(char i :str.toCharArray())
        {
                if ((str.indexOf(i) == str.lastIndexOf(i)))
            {
                System.out.println("First non-repeating character is: "+ i);
                a = false;
                break;
            }
        }

        if(a)
            System.out.println("There is no non repeating character in input string");

	}

}
