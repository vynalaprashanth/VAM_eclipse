package dataTypes;

public class TypeCastExplicit {

	public static void main(String[] args) {

		int i=53;
		byte b= (byte) i;
		int x=97;
		char ch=(char) x;
		System.out.println(ch);
		System.out.println(b);
		
		int m= 209;
		byte bb=(byte)m;
		char chr=(char) bb;
		System.out.println(bb);
		System.out.println(chr);
		
		float fl=12.9f;
		double dl=fl;
		System.out.println(fl);
	}

}
