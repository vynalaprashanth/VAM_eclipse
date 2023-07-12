package StringHandling.Immutable;

public class Myimmutables {

	
	int x;
	
	Myimmutables(int x){
		
		this.x=x;
		
	}
	public Myimmutables change(int x) {
	if(this.x==x) {
return this;
}	else {
	
	return new Myimmutables(x);
}
	}
	
	public static void main(String[] args) {
		Myimmutables m1 = new Myimmutables(20);
		
		Myimmutables m2 = m1.change(20);
		System.out.println(m1);

		
		
	}
	
	
}
