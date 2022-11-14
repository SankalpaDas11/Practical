package IO;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("F://test.txt"); // creating object of file writer
			fw.write("We are learning file handling"); // writing 
			fw.close();
			FileReader fr = new FileReader("F://test.txt"); // creating object of file reader
			int i;
			while((i = fr.read() ) != -1){
				System.out.print((char)i); // printing stored string
			}
			fr.close();
			System.out.println("\nDone"); // printing done for confirmation
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
