package IO;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class CopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fin = new FileInputStream("F://test.txt");
			FileOutputStream fout = new FileOutputStream("F://test2.txt");
			byte [] arr = new byte[1024];
			int i ;
			while((i = fin.read(arr))>0) {
				fout.write(arr);
			}
			fin.close();
			fout.close();
			System.out.println("\nDone");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
