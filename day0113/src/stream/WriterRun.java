package stream;

import java.io.FileWriter;
import java.io.Writer;

public class WriterRun {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("C:\\temp\\test1.txt");
		
		char[] array = {'홍', '길', '동'};
		writer.write(array, 0, 3);
		writer.flush();
		writer.close();
		
		System.out.println("출력 종료");
	}
}
