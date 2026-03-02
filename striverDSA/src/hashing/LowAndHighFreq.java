package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class LowAndHighFreq {
	
	public static void findMinandMaxFreq() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements in the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Eneter the elemtns into array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
//			if(map.containsKey(arr[i])) {
//				map.put(arr[i],map.get(arr[i])+1);
//			}else
//				map.put(arr[i], 1);
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
		}
		
		
		int minvalue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		
		int minKey=Integer.MAX_VALUE;
		int maxKey=Integer.MIN_VALUE;;
		
		
		for(int i:map.values()) {
			if(i<minvalue) {
				minvalue = i;
				
			}
			if(i>maxValue) {
				maxValue=i;
			}
		}
		
		for(HashMap.Entry<Integer,Integer> entry:map.entrySet()) {
			if(entry.getValue()>maxKey) {
				maxKey = entry.getKey();
				
			}
			if(entry.getValue()<minKey) {
				minKey = entry.getKey();
				
			}
		}
		
		
		
		
		
		System.out.println("Min value "+minvalue);
		System.out.println("max value "+maxValue);
		
		
		System.out.println("Min key"+minKey);
		System.out.println("max key is "+maxKey);
		
		
	}
	
	public static void main(String[] args) {
		findMinandMaxFreq();
	}

}
