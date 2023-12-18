package LogicalCoding;

import java.util.HashSet;

public class ArrayUni {
	 public static int countDistinct(int arr[], int n)
	    {
	 
	        HashSet<Integer> hs = new HashSet<Integer>();
	 
	        for (int i = 0; i < n; i++) {
	            
	            hs.add(arr[i]);
	        }
	 
	          return hs.size();
	    }
	 

	public static void main(String[] args) {
		  int arr[]
		            = new int[] { 6, 10, 5, 4, 9, 120, 4, 6, 10 };
		        System.out.println(countDistinct(arr, arr.length));
		

	}

}
