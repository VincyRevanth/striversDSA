package recursion;

public class SumOfN {
	
	public static int sumOfN(int i, int sum) {
		if(i<1) {
			return sum;
		}
		return sumOfN(i-1,sum+i);
	}

	public static int functionSumOfN(int n) {
		if(n==0) {
			return 0;
		}
		return n+functionSumOfN(n-1);
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt("10");
		System.out.println(sumOfN(n,0));
		System.out.println(functionSumOfN(n));
	}
}
