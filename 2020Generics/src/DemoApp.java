
public class DemoApp {

	public static void main(String[] args) {
		TCalcultaion<Integer>cal1 = new TCalcultaion<>();
		TCalcultaion<Double>cal2 = new TCalcultaion<>();
		
		cal1.append(10);
		cal1.append(20);
		cal1.append(30);
		cal1.append(40);
		cal1.append(50);
		
		cal2.append(1.0);
		cal2.append(2.0);
		cal2.append(3.0);
		cal2.append(4.0);
		cal2.append(5.0);
		
		System.out.println("Average of the int array: "+ cal1.average());
		System.out.println("Average of the double array: "+ cal2.average());
	}

}
