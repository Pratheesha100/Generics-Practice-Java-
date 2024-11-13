package pack1;

public class MainApp {

	public static void main(String[] args) {
		Pair <String, Integer>p1 = new Pair<>("Samadhi", 25);
		Pair <Double, String>p2 = new Pair<>( 30.567, "Shakya");
		System.out.println("Printing first pair");
		System.out.println("First value: "+ p1.getFirst());
		System.out.println("Second value: "+ p1.getSecond());
		
		System.out.println("\nPrinting Second pair");
		System.out.println("First value: "+ p2.getFirst());
		System.out.println("Second value: "+ p2.getSecond());

	}

}
