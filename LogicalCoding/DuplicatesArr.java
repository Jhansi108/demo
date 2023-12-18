package LogicalCoding;

public class DuplicatesArr {

	public static void main(String[] args) {
		int[]arr={2,3,4,2,3,4,5,6,8,7,6};
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=1+i;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					count++;
				
			}
		}
		

	}

}}
