import java.nio.file.Files;
import java.nio.file.Paths;

public class Uzd5 {

	public static void main(String[] args) throws Exception{
	     String inputFile = "enable1-word-list.txt";
			
			String word = Files.lines(Paths.get(inputFile))
					.filter(x -> x.contains("q"))
					.sorted((x,y)->(x.length()-y.length()))
					.findFirst()
					.orElse(null);
			System.out.println("Shortest word - " + word);
		}

	}