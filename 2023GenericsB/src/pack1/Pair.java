package pack1;

public class Pair <T, U>{
	private T t;
	private U u;
	Pair(T t , U u){
		this.t = t;
		this.u = u;
	}
	public T getFirst() {
		return t;
	}
	public U getSecond() {
		return u;
	}
	
	

}
