package sorting;

public class InsertionSort {
	
	
	public static void insertionSort(int[] arr) {
		
		int n= arr.length;
		for(int i=0;i<n;i++) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				swap(arr,j-1,j);
				j--;
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
		insertionSort(arr);
		System.out.print("After sorting: ");
		for (int i : arr) {
			System.out.print(i + ",");
		}
	}
	

}
