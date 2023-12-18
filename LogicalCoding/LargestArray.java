package LogicalCoding;

public class LargestArray {

	public static void main(String[] args) {
		int[]array=new int[] {68,78,90,98,76,65,45};
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) 
				max=array[i];
				
			}
			System.out.println("The largest number is :" + max);
		}

	}


