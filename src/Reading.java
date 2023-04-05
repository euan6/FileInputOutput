import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reading {

	public static void main(String[] args) {
		File file = new File("conversation.txt");

		try { 
			Scanner s = new Scanner(file); 
			read(s); s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		}

		System.out.println();
		
		try { 
			BufferedReader bf = new BufferedReader(new FileReader(file)); 
			read(bf);
		} catch (IOException e) { 
			e.printStackTrace(); 
		}
	}

	public static void read(Scanner s) {
		while (s.hasNext()) {
			String line = s.nextLine();
			System.out.println(line);
		}
	}

	public static void read(BufferedReader bf) throws IOException {
		String line;
		Scanner s = new Scanner(System.in);
		for (int i = 0; (line = bf.readLine()) != null; i++) {
			if (i % 2 == 0 && i > 0) {
				System.out.println("> Press enter to continue.");
				s.nextLine();
			}
			System.out.println(line);
		}
		bf.close();
		s.close();
	}
}