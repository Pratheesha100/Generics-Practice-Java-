package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter employee name (enter done for quit): ");
		String name =scan.nextLine();
		
		while(!"done".equals(name)) {
			array.add(name);
			System.out.print("Enter employee name (enter done for quit): ");
			name =scan.nextLine();
		}
		System.out.print("Enter employee name you want to remove: ");
        name = scan.nextLine();
        boolean remove = false;
        int length = array.size();
        for(int i = 0; i < length; i++) {
        	if( array.get(i).equals(name)) {
        		array.remove(i);
        		remove = true;
        		break;
        	}
        }
        if(remove == false) {
    		System.out.print("\nName was not removed");	
    	}
        length = array.size();
        System.out.println("\nTotal Number of employess: "+length );
        for(String element: array) {
        	System.out.print(element + ", " );
        }
        
        scan.close();
	}

}
