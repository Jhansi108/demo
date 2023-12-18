package ThreadStates;

import java.util.HashMap;
import java.util.Map;

public class MapPro {

	public static void main(String[] args) {
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"def");  
		  map.put(101,"ghij");  
		  map.put(102,"klmno");  
		  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  

	}

}
