import java.nio.file.Files;
import java.nio.file.Paths;

public class Uzd1 {

	public static void main(String[] args) throws Exception {
		String inputFile = "enable1-word-list.txt";
		String word = Files.lines(Paths.get(inputFile))
				.filter(words -> words.length()==10)
				.findFirst()
				.orElse(null);
		System.out.println("First 10 letter word - " + word);

	}

}
