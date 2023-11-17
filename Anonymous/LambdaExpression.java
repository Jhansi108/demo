package Anonymous;
interface Drawabl{  
    public void draw();  
}  

public class LambdaExpression {

	public static void main(String[] args) {
		 int width=10;  
         
	        //with lambda  
	        Drawabl d2=()->
	        {  
	            System.out.println("Drawing "+width);  
	        };  
	        d2.draw();  
		

	}

}
