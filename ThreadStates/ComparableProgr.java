package ThreadStates;

import java.util.Arrays;

class Pair implements Comparable<Pair> {
    String firstName;
    String lastName;
 
    public Pair(String x, String y)
    {
        this.firstName = x;
        this.lastName = y;
    }
 
    public String toString()
    {
        return "( " + firstName + " , " + lastName + " )";
    }
 
    @Override public int compareTo(Pair a)
    {
        
        if (this.firstName.compareTo(a.firstName) != 0) {
            return this.firstName.compareTo(a.firstName);
        }
        else {
           
            return this.lastName.compareTo(a.lastName);
        }
    }
}

public class ComparableProgr {
	

	public static void main(String[] args) {
		  int n = 4;
	        Pair arr[] = new Pair[n];
	        arr[0] = new Pair("raj", "kashup");
	        arr[1] = new Pair("rahul", "singh");
	        arr[2] = new Pair("reshmi", "dubey");
	        arr[3] = new Pair("rahul", "jetli");
	 
	        
	        Arrays.sort(arr);
	 
	       
	        print(arr);
	    }
	 
	    public static void print(Pair[] arr)
	    {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
		

	}

}}
