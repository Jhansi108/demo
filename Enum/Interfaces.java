package Enum;
interface  Pro 
{
    void printInfo();
 
}
class Program implements Pro
{
     public void printInfo()
    {
        String name= "Program";
        int age=23;
        System.out.println(name);
        System.out.println(age);
 
    }
}

public class Interfaces {

	public static void main(String[] args) {
		 Program s = new Program();
	        s.printInfo();
		

	}

}
