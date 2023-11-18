package Map;

import java.util.HashMap;
import java.util.Map;

public class MapNew {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(100, "args");
		map.put(101, "null");
		map.put(102, "KLM");
		  for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  

	}

}
