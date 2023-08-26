package week1.day2.day2assignments;

public class CheckPrimeNumberOrNot {
	public static void main(String[] args) {
		int number =2;
		boolean flag=false;
		for(int i=2;i<=number-1;i++) {
			if(number%i==0) {
				flag=true;
				break;
				
			}
		}
		if(flag) {
			System.out.println("Number is not Prime");
		}
		else {
			System.out.println("Prime");
		}
	}

}
