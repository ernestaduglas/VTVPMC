import java.nio.file.Files;
import java.nio.file.Paths;

public class Uzd4 {

	public static void main(String[] args) throws Exception{
     String inputFile = "enable1-word-list.txt";
		
		String word = Files.lines(Paths.get(inputFile))
				.filter(x -> (!x.contains("a")&& !x.contains("e")))
				.sorted((x,y)->(y.length()- x.length()))
				.findFirst()
				.orElse(null);
		System.out.println("Longest word - " + word);
	}

}
