package basicMath;

public class Extraction {

	public static void extractionOfDigits(int n) {
		int temp = n, lDigit = 0, count = 0;
		while (temp > 0) {
			lDigit = temp % 10;
			System.out.println(lDigit);
			count++;
			temp = temp / 10;
		}
		System.out.println("No of Digits " + count);
	}
	
	
	public static void extractUsingLog(int n) {
		int x =(int) Math.log10(n)+1;
		System.out.println("No of digits using log : "+x);
	}
	
	
	public static void reverseNumber(int n) {
		
		int temp=n, lDigit=0,revNum=0;
		while(temp>0) {
			lDigit = temp%10;
			revNum = revNum*10 + lDigit;
			temp=temp/10;
			
		}
		System.out.println("reverse Number is "+revNum);
		if(revNum == n) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}
	
	

	public static void main(String[] args) {
		extractionOfDigits(9789);
		extractUsingLog(9789);
		reverseNumber(7892);
	}
	
	
	
	

}
