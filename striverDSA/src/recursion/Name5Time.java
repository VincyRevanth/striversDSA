package recursion;

public class Name5Time {

	public static int name(int i, int n) {

		if (i > n) {
			return 0;
		}
		System.out.println("vincy");
		name(i + 1, n);

		return 0;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt("8");
		name(1, 3);
	}

}
