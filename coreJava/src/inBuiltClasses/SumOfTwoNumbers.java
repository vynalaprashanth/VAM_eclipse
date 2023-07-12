package inBuiltClasses;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {

		System.out.println("Enter Two Numbers");
		Scanner sc= new Scanner(System.in);
		int n1= Integer.parseInt(sc.next());
		int n2= Integer.parseInt(sc.next());
		int result=n1/n2;
		System.out.println("Result is: "+result);
		
	}

}
