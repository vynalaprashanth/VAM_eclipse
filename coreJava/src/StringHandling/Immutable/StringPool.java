package StringHandling.Immutable;

public class StringPool {

	public static void main(String[] args) {

		User U1=new User(1, "Prashanth");
		User U2=new User(1, "Prashanth");

		System.out.println(U1);
		System.out.println(U2);
		
		String s1="Prashanth";
		String s2="Prashanth";
		String s3="Prashanth";
		String s4=new String("Prashanth");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//String Comparing  
		
		System.out.println(s1==s3);                  //compares the memory location is same or not
		System.out.println(s1.equals(s3));          //compares the contents is same or not 
		
		System.out.println(s1==s4);                 // memory location changes when we use (new) 
		
		
		// Object Comparing 
		
		System.out.println(U1==U2);                  // returns false because == and equals do not work for objects
		System.out.println(U1.equals(U2));
		
		
		
	}

}
