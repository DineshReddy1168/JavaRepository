package Files;
import java.io.*;

public class BufferedOutput {

	public static void main(String[] args) {
		try {
			FileOutputStream fs=new FileOutputStream("C:\\Users\\Dinesh.Banala\\OneDrive - Bhavna Software India Pvt.Ltd\\Desktop\\Demo.txt");
			BufferedOutputStream bs=new BufferedOutputStream(fs);
			String st="Working on FileHandling";
			byte b[]=st.getBytes();
			bs.write(b);
			System.out.println("Success");
			bs.close();
			fs.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
