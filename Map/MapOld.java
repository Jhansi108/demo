package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapOld {

	public static void main(String[] args) {
	Map  map=new HashMap();
	map.put(1, "ABC");
	map.put(2, "DEF");
	map.put(3, "GHI");
	 Set set=map.entrySet();  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
	
	

	}

}
