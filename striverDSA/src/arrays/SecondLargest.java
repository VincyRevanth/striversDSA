package arrays;

public class SecondLargest {
	
	public static int secondLarge(int[] arr) {
		
		int n=arr.length;
		int max = arr[0];
		int sLarge = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				sLarge=max;
				max=arr[i];
				
			}
		}
		
		return sLarge;
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {43,24,54,1,27,89,455,9000};
		System.out.println(secondLarge(arr));
	}
	
	
	

}
