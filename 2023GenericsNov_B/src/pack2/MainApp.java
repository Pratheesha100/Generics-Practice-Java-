package pack2;

public class MainApp {

	public static void main(String[] args) {
		
		Integer[] array1 = {1,2,3,4,6};
		Integer maxInt = GenericCalculator.CalculateMaximum(array1);
	    Double product= GenericCalculator.CalculateProduct(array1);
	    System.out.println("Maximum Integer value: " + maxInt);
        System.out.println("Product of Integer values: " + product);
	    
	    Double[] array2 = {3.9, 2.0, 1.9, 2.4};
	    Double maxDouble = GenericCalculator.CalculateMaximum(array2);
	    product = GenericCalculator.CalculateProduct(array2);
	    System.out.println("Maximum Integer value: " + maxDouble);
        System.out.println("Product of Integer values: " + product);
	}

}
