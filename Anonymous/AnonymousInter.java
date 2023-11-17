package Anonymous;
interface Eatable{  
	 void eat();  
	}  

public class AnonymousInter {

	public static void main(String[] args) {
		 Eatable e=new Eatable(){  
			  public void eat(){System.out.println("Program");
			  }  
			 };  
			 e.eat();  
    
    
	}

}
