package arrays;

public class LargestElement {
	public static int largestElement(int[] arr) {
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3,76,34,12,59,9};
		
		System.out.println("Max element is "+largestElement(arr));
	}

}
