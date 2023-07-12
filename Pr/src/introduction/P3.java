package introduction;

public class P3 {

	public static void main (String []agrs) {
		int r=0;
		P3 p=new P3();
		 P3 o = p;
		 
		 
		 
		 
		 if(o==p)
			 r=1;
		 
		 
		 
		 if(o!=p)
			 r=r+10;
		 
		 
		 if(o.equals(p))
			 r=r+100;
		 if(p.equals(o))
			 r=r+1000;
		 System.out.println("result is"+r);
		 
			 
			 
	}
	
	
}
