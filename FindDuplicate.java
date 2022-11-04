
public class FindDuplicate {

	public static void main(String[] args) {
		// Find the duplicates present in an array
		int[] arr = {12,13,31,0,2,45,0,2};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
