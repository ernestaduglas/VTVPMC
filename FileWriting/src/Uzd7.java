import java.nio.file.Files;
import java.nio.file.Paths;

public class Uzd7 {

	public static void main(String[] args) throws Exception  {
		Long paths = Files.list(Paths.get("."))
				.count();
		System.out.println(paths);
			
		
	}

}
