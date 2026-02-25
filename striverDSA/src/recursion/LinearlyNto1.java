package recursion;

public class LinearlyNto1 {
	
	public static int linearlyNto1(int i,int n) {
		if(n<i) {
			return 0;
		}
		System.out.print(n+",");
		return linearlyNto1(i, n-1);
	}
	
	public static int striversNto1(int i,int n) {
		if(i<1) {
			return 0;
		}
		System.out.print(i+",");
		return striversNto1(i-1, n);
	}
	
	public static void main(String[] args) {
		linearlyNto1(1, 10);
		System.out.println();
		striversNto1(10, 10);
	}

}
