package basicMath;

public class ArmsrongNumber {
	
	public static void checkArmstrong(int n) {
		int noOfDigits = (int)Math.log10(n)+1;
		
		int temp=n,sum=0,lDigit=0;
		while(temp>0){
			lDigit=temp%10;
			sum=sum + (int)Math.pow(lDigit, noOfDigits);
			temp=temp/10;
		}
		System.out.println("Sum is"+sum);
		if(sum==n) {
			System.out.println("It is an armstorng number");
		}else {
			System.out.println("Not an armstrong");
		}
	}
	
	public static void main(String[] args) {
		checkArmstrong(153);
	}

}
