package sorting;


// time complexity is O(n^2) 

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		
		
		int n= arr.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
		
		
			swap(arr,min,i);
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
		selectionSort(arr);
		System.out.print("After sorting: ");
		for (int i : arr) {
			System.out.print(i + ",");
		}
	}

}
