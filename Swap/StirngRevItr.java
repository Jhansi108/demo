package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StirngRevItr {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
		  
        // Add elements to list 
        list.add("Keys"); 
        list.add("Type"); 
        list.add("Write"); 
  
        // Generate an iterator to iterate List in reverse 
        // order 
        ListIterator<String> gfg_itr 
            = list.listIterator(list.size()); 
  
        // hasPrevious() returns true if the list has 
        // previous element 
        while (gfg_itr.hasPrevious())  
        { 
            // Iterate in reverse 
            System.out.println(gfg_itr.previous()); 
        } 
  
        // print list in Reverse using for loop 
        for (int i = list.size() - 1; i >= 0; i--) 
        { 
            // access elements by their index (position) 
            System.out.println(list.get(i)); 
	}

}
}
