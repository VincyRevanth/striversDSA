package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class StringHashUsingMap {
	
	public static void mapp() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		HashMap<Character,Integer> map = new HashMap<>();
		
//		for (char c : ch) {
//		    map.put(c, map.getOrDefault(c, 0) + 1);
//		}
		
		
		
		
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			}
			else {
				map.put(ch[i],1);
			}
		}
		
		
		
		System.out.println("Enter no of queries");
		int q = sc.nextInt();
		while(q-->0) {
			char c = sc.next().charAt(0);
			System.out.println(map.getOrDefault(c, 0));
			
		}
		
		
		
	}
	public static void main(String[] args) {
		mapp();
	}

}
