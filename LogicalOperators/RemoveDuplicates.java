package Logical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arrayWithDuplicates = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 7};

         Set<Integer> setWithoutDuplicates = new HashSet<>();
        for (int num : arrayWithDuplicates) {
            setWithoutDuplicates.add(num);
        }

               int[] arrayWithoutDuplicates = new int[setWithoutDuplicates.size()];
        int index = 0;
        for (int num : setWithoutDuplicates) {
            arrayWithoutDuplicates[index++] = num;
        }

          System.out.println("Array with Duplicates: " + Arrays.toString(arrayWithDuplicates));
        System.out.println("Array without Duplicates: " + Arrays.toString(arrayWithoutDuplicates));

	}

}
