package DupicateValues;

public class RemoveSpeci {

	public static void main(String[] args) {
		String str="Pr!ogr#am%m*in&g Lan?#guag(e";  
		String resultStr="";  
		   
		for (int i=0;i<str.length();i++)  
		{  
		 
		if (str.charAt(i)>64 && str.charAt(i)<=122)   
		{  
		  
		resultStr=resultStr+str.charAt(i);  
		}  
		}  
		System.out.println("String after removing special characters: "+resultStr);  
	}

}
