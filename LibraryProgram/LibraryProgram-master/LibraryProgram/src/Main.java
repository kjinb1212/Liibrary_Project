import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Reader reading = new Reader();
		ArrayList<Book> bookobj = new ArrayList<Book>();
		bookobj = reading.read();
		for(int i=1; i<201; i++){
			System.out.println(bookobj.get(i).title+bookobj.get(i).author+bookobj.get(i).publisher+bookobj.get(i).location);
		}
	}
}
