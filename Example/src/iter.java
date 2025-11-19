import java.util.ArrayList;
import java.util.Iterator;


public class iter {

	
	public static void main(String[] args) {
		
		ArrayList<String> ahmed = new ArrayList<>();
		
		ahmed.add("Du");
		ahmed.add("Bist");
		ahmed.add("Dumm");
		
		
		Iterator<String> it = ahmed.iterator();
		
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
