package Map;
import java.util.ArrayList;
import java.util.List;

public class ForEachMe {

	public static void main(String[] args) {
		 List<String> gamesList = new ArrayList<String>();  
	        gamesList.add("Football");  
	        gamesList.add("Cricket");  
	        gamesList.add("Chess");  
	        gamesList.add("Hocky");  
	        System.out.println("-----Conducting Games-----");  
	        gamesList.forEach(games -> System.out.println(games));  

	}

}
