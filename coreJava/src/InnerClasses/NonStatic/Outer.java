package InnerClasses.NonStatic;

public class Outer {
 
    void f1() {
    	System.out.println("Non Static Outer Method");
    }	
	
	
	class Inner{
		void f2() {
			System.out.println("Non Static Inner Method");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Outer out=new Outer();
		out.f1();
		
		Outer.Inner inn=  out.new Inner();
		inn.f2();
		
		
	}
	
	
}
