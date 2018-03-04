import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Uzd6 {

	public static void main(String[] args) throws Exception {
		String inputFile = "enable1-word-list.txt";
		String outputFile = "twitter-words.txt";

		List<String> words = Files.lines(Paths.get(inputFile))
				.filter(x -> (x.contains("wow") || x.contains("cool")))
				.sorted()
				.map(x -> x.toUpperCase()+ "!")
				.collect(Collectors.toList());
		Files.write(Paths.get(outputFile), words, Charset.defaultCharset());
		System.out.printf("wrote %s", words.size());

	}
}
				
			



