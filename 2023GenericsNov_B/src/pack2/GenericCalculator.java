package pack2;

public class GenericCalculator {
    
    
    public static <T extends Number & Comparable<T>> T CalculateMaximum(T[] array){
    
    	if(array.length == 0 || array == null) {
    		return null;
    	}
    	T max = null;
    	for( T element : array) {
    		if(element.compareTo(max)> 0) {
    			max = element;
    		}
    	}
		return max;
    	
    }
    
    public static <T extends Number> double CalculateProduct(T[] array){
    	if(array.length == 0 || array == null) {
    		return 0;
    	}
        double product = 1.0;
    	for( T element : array) {
    	    product *= element.doubleValue();	
    	}
		return product;
    	
    }
	
}
