package week1.day2.day2assignments;

public class PrimeNumbers {
	public static void main(String[] args) {
		
		boolean flag=false;
		int counter=0;
		for (int i = 2; i < 20; i++) {
			for (int j = 2; j <=i/2; j++) {
				if(i%j==0) {
					flag=true;			
					break;
					
				}
			}
			if(!flag) {
				System.out.println("Prime numbers: "+i);
				counter=counter+1;
				flag=false;
			}
			else
				flag=false;
		}
	
		System.out.println("The total number of Prime Numbers till range is :"+ counter);
	}

}

