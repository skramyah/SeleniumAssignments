package week1.day2.day2assignments;

public class FibonacciSeries  {
	
	public static void main(String[] args) {
	
		int range=8;
		int firstNum=0;
		int secNum=1;
		int sum=0;
		System.out.print(firstNum);
		for (int i = 1; i < range; i++) {
			sum=firstNum+secNum;
			System.out.print(" "+sum);
			firstNum=secNum;
			secNum=sum;
			
		}
		
		System.out.println("Now writing fibonacci series till number 50");
		
		 firstNum=0;
		 secNum=1;
		 sum=0;
		
		 System.out.print(firstNum+" "+secNum);
		for(int j=1;j<20;j++) {
			sum=firstNum+secNum;
			if(sum<56) {
			System.out.print(" "+sum);
			}
			else
				break;
			firstNum=secNum;
			secNum=sum;
			
		}
	
	}
	
}
