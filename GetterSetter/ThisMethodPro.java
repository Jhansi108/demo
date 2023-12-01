package GetterAndSetter;

public class ThisMethodPro {
	 private String fruit;
	    private int price ;

	    	    public ThisMethodPro(String fruit, int price) {
	        this.fruit = fruit;
	        this.price = price;
	    }

	    	    public ThisMethodPro(String name) {
	        this(name, 0); 
	    }

	    public void displayInfo() {
	        System.out.println("Fruit: " + fruit + ", Price: " + price);
	    }

	public static void main(String[] args) {
		ThisMethodPro person1 = new ThisMethodPro("Apple", 25);
	        person1.displayInfo();

	        ThisMethodPro person2 = new ThisMethodPro("Mango",30);
	        person2.displayInfo();
		

	}

}
