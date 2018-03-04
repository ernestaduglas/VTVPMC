import java.nio.file.Files;
import java.nio.file.Paths;

public class Uzd2 {

	public static void main(String[] args) throws Exception {
		String inputFile = "enable1-word-list.txt";
		
		String word = Files.lines(Paths.get(inputFile))
				.filter(x -> x.length()==8)
				.filter(x -> (x.contains("a")&& x.contains("b") && x.contains("c")))
				.findFirst()
				.orElse(null);
		System.out.println("First 8 letter word - " + word);

	}

}
