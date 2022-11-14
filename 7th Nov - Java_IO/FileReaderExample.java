package IO;
import java.io.FileReader;
public class FileReaderExample {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("F://test.txt"); // creating object of file reader
			int i;
			while((i = fr.read() ) != -1){
				System.out.println((char)i); // printing stored string characterwise
			}
			fr.close();
			System.out.println("Done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
