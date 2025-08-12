package Files;
import java.io.*;

public class FileInput {

	public static void main(String[] args) {
		try {
			FileInputStream fi=new FileInputStream("C:\\Users\\Dinesh.Banala\\OneDrive - Bhavna Software India Pvt.Ltd\\Desktop\\Demo.txt");
			int i=0;
			while((i=fi.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			fi.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
