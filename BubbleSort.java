public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,5,2,4,3,1,6};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int tempVar  = a[j];
					a[j] = a[j+1];
					a[j+1] = tempVar;
				}
			}	
		}
		for(int elem: a) {
			System.out.print(elem+" ");
		}
	}

}
