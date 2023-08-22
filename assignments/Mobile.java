package week1.day1.assignments;

public class Mobile {
	
	void makeCall(){
		String mobileModel="Redmi";
		float mobileWeight=2.2f;
		System.out.println("The mobile model is "+mobileModel+"\n"+"mobile weight is "+mobileWeight);
		System.out.println("This is the make Call method");
	}
	void sendMsg() {
		boolean isFullyCharged=false;
		int mobileCost=10000;
		System.out.println("This is the send message method");
		System.out.println("The mobile cost is : "+mobileCost+"\n"+ " the mobile charging mode is "+isFullyCharged);
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		System.out.println(m);
		System.out.println("This is my mobile");
		m.makeCall();
		m.sendMsg();
	}

}
