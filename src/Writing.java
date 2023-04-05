import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {

	public static void main(String[] args) throws IOException {

		String[] lines = {"What took you so long?", 
						  "Well, you know, Master, I couldn't find a speeder that I really liked...",
						  "There he is.",
						  "...with an open cockpit and the right speed capabilities.",
						  "If you spent as much time practicing your saber techniques as you did your wit,",
						  "you'd rival Master Yoda as a swordsman.",
						  "I thought I already did.",
						  "Only in your mind, my very young apprentice."};
		BufferedWriter bf = null;
		try {
			bf = new BufferedWriter(new FileWriter("conversation.txt"));
			for (String line : lines) {
				bf.write(line);
				bf.newLine();
			}
			System.out.println("File written successfully!");
		} catch (IOException e) {
			System.out.println("Something went wrong!");
			e.printStackTrace();
		} finally {
			try {
				if (bf != null) {
					bf.close();
				}
			} catch (IOException e) {
				System.out.println("Did not work!");
				e.printStackTrace();
			}
		}
	}
}
