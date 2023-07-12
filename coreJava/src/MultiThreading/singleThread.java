package MultiThreading;

public class singleThread {

	public static void main(String[] args) {
	
		
		singleThread st= new singleThread();
		st.printNumbers();
		
		for(int j=1;j<10;j++) {
			System.out.print("j is :"+j+"\t");
		}
		
}
		
		void printNumbers() {
			
		for(int i=1;i<5;i++) {
			
			System.out.print("i is: "+i+"\t");
			
		}

		}
	
	
}