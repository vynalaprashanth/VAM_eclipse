package dataTypes;

public class WrapperClass {

	public static void main(String[] args) {

		int i=100;
		Integer y= Integer.valueOf(i);      //convert from primitive to object 
		int z= y.intValue();               //convert from object to integer
		System.out.println(y);
//
	byte b=12;
	String s= Byte.toString(b); // covert byte(Primitive) to String
 byte bb=	Byte.parseByte(s);  // convert string to byte
		
	System.out.println(bb);
		
	
	//
	long l=1099;
	
Long lo= Long.valueOf(l);
	String li=lo.toString();    // convert long to string
	Long m= Long.valueOf(li);   // convert string to long
	
	System.out.println(m);
	 
	
	}

}
