package IoStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {



	public static void main(String[] args)  {


		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {

			fis = new FileInputStream("C:\\Users\\PrashanthVynala\\OneDrive - ValueMomentum, Inc\\Pictures\\Google piks\\pexels.jpg");

			fos = new FileOutputStream(
					"C:\\Users\\PrashanthVynala\\OneDrive - ValueMomentum, Inc\\Pictures\\Google piks\\newls.jpg");

			int data;
			data = fis.read();
			while (data != -1) {
				fos.write(data);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
//			try {
//				fis.close();
//				fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			System.out.println("Finally printed");

		}

	}

}
