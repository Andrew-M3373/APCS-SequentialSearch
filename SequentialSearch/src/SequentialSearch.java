import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class SequentialSearch {

	static int index = 0;
	
	public static void main(String[] args) throws IOException {

		Scanner file = new Scanner(new File("Matrix"));
		while (file.hasNext()) {
			findV(file);
		}
		
	}
	
	public static void findV(Scanner f) {
		if (f.next().contains("v")) {
			System.out.println("Index of the letter \"v\": " + index);
		}
		index ++;
	}

}
