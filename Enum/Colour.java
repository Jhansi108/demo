package Enum;
enum Color {
    RED, GREEN, BLUE; 
}

public class Colour {

	public static void main(String[] args) {
		 Color myColor = Color.RED;
	        
	            switch (myColor) {
	            case RED:
	                System.out.println("Selected color is Red");
	                break;
	            case GREEN:
	                System.out.println("Selected color is Green");
	                break;
	            case BLUE:
	                System.out.println("Selected color is Blue");
	                break;
	        }
	        
	          System.out.println("Available colors:");
	        for (Color color : Color.values()) {
	            System.out.println(color);
		

	}

}}
