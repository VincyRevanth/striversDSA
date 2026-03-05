package arrays;

public class IsArraySorted {
	
	public static boolean checkSorted(int[] arr) {
		int n =arr.length;
		
		
		for(int i=1;i<n;i++) {
			if(arr[i-1]<=arr[i]) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
	


	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,9};
		
		System.out.println(checkSorted(arr));
	}
}
