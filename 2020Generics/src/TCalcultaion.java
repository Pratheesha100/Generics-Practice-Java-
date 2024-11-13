import java.util.ArrayList;

public class TCalcultaion <T extends Number>{
	ArrayList<T> numList= new ArrayList<>();
   
	public void append(T obj) {
	 numList.add(obj);	
	}
	
	public double average() {
		double avg, sum = 0;
		for( T value : numList) {
			sum = sum + value.doubleValue();
		}
		avg = sum / numList.size();
		return avg;
	}
}
