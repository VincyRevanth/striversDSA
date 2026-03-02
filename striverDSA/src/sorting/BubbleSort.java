package sorting;

public class BubbleSort {

	
	
	public static void bubbleSort(int[] arr) {
	
		int n= arr.length;
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<=i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	public static void swap(int[] arr,int i,int j) {
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] arr = { 41, 63, 12, 89, 71, 9, 32 };
		System.out.print("Before Sorting: ");
		for (int i : arr) {

			System.out.print(i + ",");
		}
		System.out.println();
		bubbleSort(arr);
		System.out.print("After sorting: ");
		for (int i : arr) {
			System.out.print(i + ",");
		}
	}
}
