package recursion;

public class ReverseArray {
	
	public static void reverse(int i, int n, int[] arr) {
		if(i>=n/2) {
			return;
		}
		swap(arr[i],arr[n-i-1],arr);
		reverse(i+1,n,arr);
		
		
		
		
		
	}
	
	public static void swap(int a,int b,int[] arr) {
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
		
	}
	
	
	
	public static void main(String[] args) {
		int[] a = {3,4,2,1,5};
		reverse(0,a.length,a);
		for(int i:a) {
			System.out.println(i+",");
		}
	}

}
