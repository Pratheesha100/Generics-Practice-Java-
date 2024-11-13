
public class generics<T> {
	T thingtoPrint;
	
	public generics(T thingtoPrint) {
	this.thingtoPrint = thingtoPrint;
	}
	
	public void print() {
		System.out.println(thingtoPrint);
	}
}
