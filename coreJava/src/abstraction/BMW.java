package abstraction;

public abstract class BMW {

	void common() {
		
		System.out.println("Inside Common");
	}
	
	abstract void acceleration();
	
	public static void main(String[] args) {
		System.out.println("Inside Main");
	}
}
