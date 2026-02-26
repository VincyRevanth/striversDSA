package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapping {

	public static void map() {
		Scanner sc = new Scanner(System.in);
		System.out.println("No of elements to be entered into array");
		int x = sc.nextInt();
		int[] arr = new int[x];
		for(int i=0;i<x;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		//pre compute
		
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<x;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		
		
		
		
		
		
		
		//
		
		System.out.println("No of queries");
		int q = sc.nextInt();
		while(q-->0) {
			int number = sc.nextInt();
			System.out.println( map.getOrDefault(number, 0));
		}
	}
	public static void main(String[] args) {
		map();
	}

}
