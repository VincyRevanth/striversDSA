package basicMath;

import java.util.TreeSet;

public class AllDivisors {
	
	public static void divisors(int n) {
		TreeSet<Integer> ts = new TreeSet();
		for(int i=1;i<=(int)Math.sqrt(n);i++) {
			if(n%i==0) {
				//System.out.print(i+",");
				ts.add(i);
				if((n/i)!=i) {
					//System.out.print(n/i+",");
					ts.add(n/i);
				}
				
			}
		}
		System.out.println();
		System.out.print("After sorting: ");
		for(int i:ts) {
			System.out.print(i+",");
		}
	}
	public static void main(String[] args) {
		divisors(36);
	}

}
