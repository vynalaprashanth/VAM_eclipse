package InnerClasses.NonStatic;

public class AccessOuter {

	private static int x=50;
	private int y;
	
	AccessOuter(int y){
		
		this.y=y;
	}
	void f1() {
		System.out.println("Outer class non static method");
	}
	class Inner{
		private int z;
		Inner(int z){
			this.z=z;
		}
		private void f2() {
		
			System.out.println("Outer class x"+AccessOuter.x);
			System.out.println("Outer class y"+AccessOuter.this.y);
			System.out.println("Inner class y"+this.z);

			
		}
		
		
	}
	
	
	public static void main(String[] args) {

		AccessOuter out= new AccessOuter(30);
		out.f1();
		
		AccessOuter.Inner inn= out.new Inner(30);
		inn.f2();
		System.out.println(inn.z);
		
		
	}

}
