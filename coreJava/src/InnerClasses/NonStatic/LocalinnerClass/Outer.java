package InnerClasses.NonStatic.LocalinnerClass;

public class Outer {

	void f1() {
		System.out.println("Inside Outer f1");
	
	class LocalInner{
		void f2() {
			System.out.println("Inside Local Inner f2");
			
		}
	}
		LocalInner inn=new LocalInner();
		inn.f2();
		
	}
	
	
	
	public static void main(String[] args) {

		Outer out=new Outer();
		out.f1();
		
		
	}

}
