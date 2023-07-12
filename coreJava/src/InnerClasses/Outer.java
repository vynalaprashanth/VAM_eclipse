package InnerClasses;

public class Outer {

	static void f1() {
		System.out.println("Inside Outer");
	}
	
	
	
	 static  class inner{
		 static void f2() {
				System.out.println("Inside Inner");
			}
		
		 void f3() {
			 System.out.println("Non static f3 Inner");
		 }
		 
		 
	}
	
	
	public static void main(String[] args) {

		
		Outer.f1();
		Outer.inner.f2();
		Outer.inner inn=new Outer.inner();
		inn.f3();
		
	}

}
