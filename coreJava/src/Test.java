import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

//public class Test 
//{
//    public int aMethod()
//    {
//       static  int i = 0;           // static cannot be placed before int it gives compilation error...
//        i++;
//        return i;
//    }
//    public static void main(String args[])
//    {
//        Test test = new Test();
//        test.aMethod();
//        int j = test.aMethod();
//        System.out.println(j);
//    }
//}

//
//import java.util.*;
//class Test 
//{
//    public static void main(String [] args) 
//    {
//        float f = 42.0f;
//        float [] f1 = new float[2];
//        float [] f2 = new float[2];
//        float [] f3 = f1;
//        long x = 42;
//        f1[0] = 42.0f;
//        
//        
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(f3);
//
//    }
//}

//public class Test 
//{
//    final static short x = 2;
//    public static int y = 0;
//    public static void main(String [] args) 
//    {
//        for (int z=0; z < 3; z++) 
//        {
//            switch (z) 
//            {
//                case x: System.out.print("0 ");
//                case x-1: System.out.print("1 ");
//                case x-2: System.out.print("2 ");
//            }
//        }
//    }
//}

//public class Test 
//{
//    static boolean b1, b2;
//    public static void main(String [] args) 
//    {
//        int x = 0;
//        if ( !b1 ) /* Line 7 */
//        {
//            if ( !b2 ) /* Line 9 */
//            {
//                b1 = true;
//                x++;
//                if ( 5 > 6 ) 
//                {
//                    x++;
//                }
//                if ( !b1 ) 
//                    x = x + 10;
//                else if ( b2 = true ) /* Line 19 */
//                    x = x + 100;
//                else if ( b1 | b2 ) /* Line 21 */
//                    x = x + 1000;
//            }
//        }
//        System.out.println(x);
//    }
//}

//
//class Test 
//{ 
//    public static void main(String[] args) 
//    {
//        int i1 = 5; 
//        int i2 = 6; 
//        String s1 = "7"; 
//        System.out.println(i1 + i2 + s1); /* Line 8 */
//    } 
//}

//
//public class Test 
//{
//    public static void main(String [] args) 
//    {
//        Dog [][] theDogs = new Dog[3][];
//        System.out.println(theDogs[2][0].toString());
//    }
//}
//class Dog { }

//abstract public class Test{}       
//final abstract class Test {}
//public static interface Test {}       //interface have only public and abstract modifiers not static 
//final public class Test {}          //correct    
//protected abstract class Test {}
//protected interface Test {}
//abstract public class Test {}    //correct

//public class Test{
//	
//	
//	public static void main(String[] args) {
//		
//	
//
//for(int i = 0; i < 3; i++) 
//{ 
//    switch(i) 
//    { 
//        case 0: break; 
//        case 1: System.out.print("one "); 
//        case 2: System.out.print("two "); 
//        case 3: System.out.print("three "); 
//    } 
//}
//
//System.out.println("done");
//
//	}

//
//class Exc0 extends Exception { } 
//class Exc1 extends Exc0 { } /* Line 2 */
//public class Test 
//{  
//    public static void main(String args[]) 
//    { 
//        try 
//        {  
//            throw new Exc1(); /* Line 9 */
//        } 
//        catch (Exc0 e0) /* Line 11 */
//        {
//            System.out.println("Ex0 caught"); 
//        } 
//        catch (Exception e) 
//        {
//            System.out.println("exception caught");  
//        } 
//    } 
//}

//
//public class Test {
//public static void main(String args[])
//{
//String[] ar= {"c","d","b","a","e"};
//InnerClass in=new InnerClass();
//Arrays.parallelSort(ar, in);
//for(String str : ar)
//System.out.println(str +"");
//System.out.println(Arrays.binarySearch(ar, "b"));
//}
//static class InnerClass implements Comparator<String>
//{
//public int compare(String s1, String s2)
//{
//return s2.compareTo(s1);
//}
//}
//}

//
//public class Test 
//{  
//    public static void main(String args[])
//    { 
//        class Foo 
//        {
//            public int i = 3;
//        } 
//        Object o = (Object)new Foo();
//        Foo foo = (Foo)o;
//        System.out.println("i = " + foo.i);
//    }
//}

//public class Test 
//{
//    public int x = 420;
//    protected int doStuff() { return x; }
//}
//
//
//
//public class ChildUtil extends ParentUtil 
//{
//    public static void main(String [] args) 
//    {
//        new ChildUtil().callStuff();
//    }
//    void callStuff() 
//    {
//        System.out.print("this " + this.doStuff() ); /* Line 18 */
//        ParentUtil p = new ParentUtil();
//        System.out.print(" parent " + p.doStuff() ); /* Line 20 */
//    }
//}

//
//class Test 
//{
//    public static void main(String [] args) 
//    {
//        int x = 0x80000000;
//        System.out.print(x + " and  ");
//        x = x >>> 31;
//        System.out.println(x);
//    }
//}

//class Test 
//{
//    public static void main(String [] args) 
//    {
//        Test p = new Test();
//        p.start();
//    }
//
//    void start() 
//    {
//        boolean b1 = false;
//        boolean b2 = fix(b1);
//        System.out.println(b1 + " " + b2);
//    }
//
//    boolean fix(boolean b1) 
//    {
//        b1 = true;
//        return b1;
//    }
//}

//public class Test 
//{
//    public void loop() 
//    {
//        int x= 0;
//        while ( 1 ) /* Line 6 */
//        {
//            System.out.print("x plus one is " + (x + 1)); /* Line 8 */
//        }
//    }
//}

//public  class Test(int x) 
//{ 
//    int odd = 1; 
//    if(odd) /* Line 4 */
//    {
//        System.out.println("odd"); 
//    } 
//    else 
//    {
//        System.out.println("even"); 
//    } 
//}
//public class Test{
//	
//public static void main(String[] args) {
//	
//
//int i = 1, j = 10; 
//do 
//{
//    if(i > j) 
//    {
//        break; 
//    } 
//    j--; 
//} while (++i < 5); 
//System.out.println("i = " + i + " and j = " + j);
//}
//}

//public class Test{
//	
//	
//	public static void main(String[] args) {
//		
//		int Integer=28;
//		char String ='I';
//		
//		System.out.println(Integer);
//		
//		System.out.println(String);
//
//	}
//
//public class Test{
//    public static void main(String[] args){
//                  short x = 10;
//                  x =  x * 5;
//                  System.out.print(x);
//    }
//}

//	
//public class Test{
//    public static void main(String[] args){
//            int[]  x = { 016};
//            for(int i = 0; i < x.length; i++){
//                     System.out.print(x[i] + "");
//            }                   
//    }
//}
//	

//	public class Test{
//public static void main(String[] args)
//{
//        String s1="Buggy";
//        String s2="Bread";
//        
//        String s3="BuggyBread";
//        String s4="BuggyBread";
//        
//        String s5 = new String("LetsDebug");
//        String s6 = new String("LetsDebug");
//        
//        String s7 = s1+s2;
//        String s8 = s5+s6;
//        
//        
//        System.out.println(s3.equals(s7)); // Output 1
//       System.out.println(s3==s4); // Output 2
//     System.out.println(s5==s6); // Output 3
//     System.out.println(s3==s7); // Output 4
//        System.out.println("LetsDebug"==s8); // Output 5
//        System.out.println(s3.hashCode()==s4.hashCode()); // Output 6
//     System.out.println(s5.hashCode()==s6.hashCode()); // Output 7
//        
//        s7 = s5;
////        
//        System.out.println(s7.equals("BuggyBread")); // Output 8
//        System.out.println(s7.equals("LetsDebug")); // Output 9
//       System.out.println(s7 == s5);  // Output 10
//}
//	}

//public class Test{
//	public static void main(String[] args) {
//		System.out.println(17.0/4);
//	}
//}

//public class Test {
//	int a;
//	boolean b;
//	static int c;
//
//	public void display() {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//	}
//
//	public static void main(String[] args) {
//
//		Test c = new Test();
//		c.display();
//
//	}
//}

//public class Test{
//
//public static void main(String[] args)
//{
//int i=9;
//if(i==9)
//{
//int i=8;
//System.out.println(i);
//}
//}
//}

//public class Test {
//public static void main(String[] args) {
//int a = 010;
//int b = 07;
//System.out.println(a);
//System.out.println(b);
//}
//}

//	public static void main(String[] args) {
//
//		System.out.println("Enter Your Name");
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println(sc.next() + " is a good name");
//		System.out.println("\nEnter age");
////		int c = sc.nextInt();
//		System.out.println(sc.nextInt()+" Is Your Age ");
//
//	}
//}
//public class Test {
//	public static void main(String[] args) {
//		
//	
//	   int x = 5;
//	   x *= (3 + 7);
//	    System.out.println(x);
//	   }
//}

//
//
//interface MyInterface {
//    void myMethod();
//}
//
//class MyClass implements MyInterface {
//    public void myMethod() {
//        System.out.println("Implementing myMethod");
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        MyInterface obj = new MyClass(); // Creating an instance of a class implementing the interface
//        obj.myMethod(); // Calling the method defined in the interface
//    }
//}



public class Test {  
public static void main(String[] args) {  
    int count = 1;  
    while (count <= 15) {  
    System.out.println(count % 2 == 1 ? "***" : "+++++");  
    ++count;  
        }      // end while  
    }       // end main   
 }  












