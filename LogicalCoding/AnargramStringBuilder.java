package LogicalCoding;

import java.util.Arrays;

public class AnargramStringBuilder {

	public static void main(String[] args) {
		  String[] words = {"listen", "silent", "enlist", "hello", "world", "lives", "elvis"};

	        findAndPrintAnagrams(words);
	    }

	    static void findAndPrintAnagrams(String[] words) {
	        for (int i = 0; i < words.length; i++) {
	            for (int j = i + 1; j < words.length; j++) {
	                if (areAnagrams(words[i], words[j])) {
	                    System.out.println(words[i] + " and " + words[j] + " are anagrams.");
	                }
	            }
	        }
	    }

	    static boolean areAnagrams(String str1, String str2) {
	        
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        
	        StringBuilder sb1 = new StringBuilder(str1);
	        StringBuilder sb2 = new StringBuilder(str2);

	        
	        sortStringBuilder(sb1);
	        sortStringBuilder(sb2);

	        
	        return sb1.toString().equals(sb2.toString());
	    }

	    static void sortStringBuilder(StringBuilder sb) {
	        char[] charArray = sb.toString().toCharArray();
	        Arrays.sort(charArray);
	        sb.setLength(0); 
	        sb.append(charArray); 	
	}

}
