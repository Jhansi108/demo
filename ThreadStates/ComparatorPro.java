package ThreadStates;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorPro {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
        
		list.add(10);
		list.add(300);
		list.add(45);
		list.add(2);
		list.add(5);
		 
		
		Collections.sort(list);
		 
		System.out.println(list);
		 
		
		Collections.sort(list, Collections.reverseOrder());
		 
		System.out.println(list);
	}

}
