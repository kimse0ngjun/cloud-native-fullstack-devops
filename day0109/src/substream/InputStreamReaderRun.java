package substream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderRun {

	public static void main(String[] args) {

		InputStreamReader isr = null;
		
		try {
			isr = new InputStreamReader(new FileInputStream("reader.txt"));
			int i;
			while((i = isr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
