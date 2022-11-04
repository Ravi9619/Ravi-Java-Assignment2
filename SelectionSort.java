import java.util.Iterator;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,11,24,2,4,21};
		int n = arr.length;
		
		for(int i=0;i<arr.length-1;i++) {
			int smallest = i;
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		
		for(int elem: arr) {
			System.out.print(elem+" ");
		}
	}

}
