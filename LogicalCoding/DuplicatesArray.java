package LogicalCoding;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesArray {

	public static void main(String[] args) {

	int array[] = {10,20,30,30,40,10,50,20,60,60};
		int n=array.length;
		Set set=new HashSet<>();
		for(int i=0;i<n;i++) 
			set.add(array[i]);
		System.out.println(set);

	}

}
