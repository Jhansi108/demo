package LogicalCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargrstArrays {

	public static void main(String[] args) {
		int []arr= {505,808,606,6779,8896,6642};
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		System.out.println("The largest number in the array :" + Collections.max(list));

	}

}
