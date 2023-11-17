package Anonymous;
interface sayable{  
    void say(String msg);  
}  

public class FunctionalInter implements sayable {
	   public void say(String msg){  
	        System.out.println(msg);  
	    }  

	public static void main(String[] args) {
		FunctionalInter inter=new FunctionalInter();
		inter.say("Interface");
		

	}

}
