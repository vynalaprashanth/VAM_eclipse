package StringHandling.Immutable;

public class Test {

	public static void main(String[] args) {

		User us=new User(1, "Prashanth");
		
		System.out.println(us);
		us.hashCode();
		
		String s= new String("Prashanth");
		System.out.println(s);
		Integer i= new Integer(23);
		System.out.println(i);
	}

}
