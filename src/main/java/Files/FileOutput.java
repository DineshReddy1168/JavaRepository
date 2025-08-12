package Files;
import java.io.*;

public class FileOutput {

	public static void main(String[] args) {
		try {
			FileOutputStream fo=new FileOutputStream("C:\\Users\\Dinesh.Banala\\OneDrive - Bhavna Software India Pvt.Ltd\\Desktop\\Demo.txt");
			String str="Welcome to Bhavana Corp.";
			byte b[]=str.getBytes();
			fo.write(b);
			fo.close();
			System.out.println("Success");
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}

}
