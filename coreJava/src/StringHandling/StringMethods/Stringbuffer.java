package StringHandling.StringMethods;

public class Stringbuffer {

	public static void main(String[] args) {

		StringBuffer sb= new StringBuffer();
		System.out.println("Initial capacity"+sb.capacity());
		
		sb.append("Every thing is possible.");
		sb.append("If you step ahead");
		
		System.out.println(sb);
		
		System.out.println("Current capacity"+sb.capacity());
		
		System.out.println(sb.charAt(12));
		
		StringBuffer sb1=new StringBuffer("abcde");
		System.out.println(sb1.reverse());
		//System.out.println(sb1.replace(start, end, str));f
		System.out.println(sb.insert(2, "o"));
		System.out.println(sb.delete(3, 9));
		
	}

}
