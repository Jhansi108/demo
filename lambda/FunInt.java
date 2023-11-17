package Lambda;
interface Writable
{  
    void write(String txt);  
}  

public class FunInt implements Writable {
	 public void write(String txt)
     {  
         System.out.println(txt);  
     }  

	public static void main(String[] args) {
		FunInt inter=new FunInt();
		inter.write("program");

	}

}
