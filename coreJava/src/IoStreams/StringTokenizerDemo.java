package IoStreams;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String s="The,string,tokenizer,class,allows,an,application,to,break,a,string,into,tokens.";
		StringTokenizer st=new StringTokenizer(s,",",false);
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
		}
		
	}

}
