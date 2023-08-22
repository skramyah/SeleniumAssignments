package week1.day1.assignments;

public class TwoWheeler {

	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=12344l;
	boolean isPunctured=false;
	String bikeName="Pulsar";
	double runningKM=10008d;
	public static void main(String[] args) {
		TwoWheeler tw=new TwoWheeler();
		System.out.println(" Two wheeler name is :"+tw.bikeName);
		System.out.println(" No of wheels : "+tw.noOfWheels);
		System.out.println("Chassis Number :"+tw.chassisNumber);
		System.out.println("is Punctured :"+tw.isPunctured);
	}
}
