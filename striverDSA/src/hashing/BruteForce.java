package hashing;

//it takes O(q*n) q->no of numbers 

public class BruteForce {
	
	public static int count(int n,int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				count++;
			}
		}
		return count;
	}
	
	
	public static int charHash(char c,String s) {
		char[] arr = s.toCharArray();
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==c) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {3,2,6,3,7,3,3,3};
		System.out.println(count(3,arr));
		System.out.println(charHash('a', "always"));
	}
	

}
