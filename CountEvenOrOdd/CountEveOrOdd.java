package CountEvenorOdd;

public class CountEveOrOdd {

	public static void main(String[] args) {
		long num=123456789;
		
		//Counting the even and odd digits
		
		int evenCount = 0;
		int oddCount = 0;
		
		while(num!=0) {
			long digit = num % 10;

            if (digit % 2 == 0) {
                evenCount++;
            } 
            else {
            	
                oddCount++;
            }

            // Move to the next digit
            num /= 10;
        }

        
        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);
		}
			
		

	}


