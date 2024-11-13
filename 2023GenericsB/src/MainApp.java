import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		
		System.out.print("Enter an integer number(enter 0 to stop): ");
		int number = input.nextInt();
		
		while(number != 0) {
			num.add(number);
			System.out.print("Enter an integer number(enter 0 to stop): ");
			number = input.nextInt();
		}
		input.close();
		
		num.removeIf(numbers -> numbers % 2 == 0);
		
		System.out.print("Odd number: [ ");
		for( int num1 : num) {
			System.out.print( num1+", ");
		}
		System.out.print("]");
	

	}

}
