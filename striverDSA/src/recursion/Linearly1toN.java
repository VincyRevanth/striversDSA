package recursion;

public class Linearly1toN {
	
	public static int linearly(int i,int n) {
		if(i>n) {
			return 0;
		}
		System.out.print(i+",");
		return linearly(i+1, n);
		
	}
	
	public static void main(String[] args) {
		linearly(1, 10);
	}

}
