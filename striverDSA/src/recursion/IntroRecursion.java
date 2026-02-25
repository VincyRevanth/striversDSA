package recursion;

public class IntroRecursion {
	static int count=0;
	
	public static int f() {
		
		if(count==3) {
			return 0;
			
		}
		else {
			System.out.println(count);
			count++;
			f();
		}
		return count;
	}
	
	public static void main(String[] args) {
		f();
	}
	

}
