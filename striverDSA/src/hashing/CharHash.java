package hashing;

import java.util.Scanner;

import com.sun.tools.javac.Main;

public class CharHash {
	public static void hashing() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		
		System.out.println("enter the character to find the sequence");
		char c= sc.next().charAt(0);
		
		int[] hash = new int[256];
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			//hash[ch[i]-'a']++; -- for hash[26]
			hash[ch[i]]++; //for hash[256]
		}
		
		//System.out.println(hash[c-'a']);// for hash[26]
		System.out.println(hash[c]); // for hash[256]
		
		
		
		
	}
	public static void main(String[] args) {
		hashing();
	}
	
}
