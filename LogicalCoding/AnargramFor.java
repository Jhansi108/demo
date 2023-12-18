package LogicalCoding;

import java.util.Arrays;

public class AnargramFor {

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

	        
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();

	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        
	        return Arrays.equals(charArray1, charArray2);

	}

}
