package Loans;

public class replaceall {

	public static void main(String[] args) {
		String str = "/ samsung /";
		str= str.replaceAll("[^,*,a-z,A-Z,0-9]"," ");
		System.out.println(str);

	}

}
