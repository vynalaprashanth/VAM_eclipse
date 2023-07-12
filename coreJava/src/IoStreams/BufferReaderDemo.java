package IoStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferReaderDemo {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;

		

		try {
			fr = new FileReader("C:\\Users\\PrashanthVynala\\OneDrive - ValueMomentum, Inc\\Documents\\Venny\\Core.txt");
			br = new BufferedReader(fr);

			String line;
			int count = 0;
			// line=br.readLine();
			while ((line = br.readLine())!= null) {

				StringTokenizer st = new StringTokenizer(line);

				while (st.hasMoreElements()) {
					System.out.println(st.nextToken());
					count++;
				}				

			}				System.out.println("Number of words: "+count);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
