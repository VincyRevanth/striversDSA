package hashing;

import java.util.Scanner;

public class BasicHash {
	
	public static int hash(int[] a,int n) {
		
		int[] hashArray = new int[100];
		
		for(int i=0;i<a.length;i++) {
			hashArray[a[i]]+=1;
			
		}
		
		return hashArray[n];
		
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No of elements in to the array");
		int q = sc.nextInt();
		System.out.println("Enter the elements");
		int[] arr1 = new int[q];
		for(int i=0;i<q;i++) {
			arr1[i]=sc.nextInt();
		}
		//int[] arr = {2,5,4,3,3,3,6,4,1,3,5,7};
		System.out.println("Which element you want to search");
		int search = sc.nextInt();
		System.out.println(hash(arr1,search));
	}

}
