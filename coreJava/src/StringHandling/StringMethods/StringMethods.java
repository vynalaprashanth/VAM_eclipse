package StringHandling.StringMethods;

public class StringMethods {

	public static void main(String[] args) {

		String s= "Hello World";
		
		System.out.println("Length of String: "+s.length());
		System.out.println("Index of String: "+s.indexOf('l'));
		System.out.println("Character At: "+s.charAt(4));
		
		System.out.println("Substring at beginning: "+s.substring(2));
		System.out.println("Substring at begin and end: "+s.substring(0, 4));

	
	String[] result = s.split(" ");
	
	for(int i=0;i<result.length;i++) {
	System.out.println(result[i]);
	}
	
	}

}
