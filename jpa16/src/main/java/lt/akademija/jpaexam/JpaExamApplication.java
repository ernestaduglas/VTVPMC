package lt.akademija.jpaexam;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lt.akademija.jpaexam.ex01simple.CarEntity;
import lt.akademija.jpaexam.ex01simple.CarRepository;

@SpringBootApplication
public class JpaExamApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(JpaExamApplication.class, args);
		
		CarRepository repo = new CarRepository();
	
		
		 Date aDate = new Date();
		 CarEntity c = new CarEntity();
	        c.setModel("A model");
	        c.setManufactureDate(aDate);
	        c.setId(1L);
	        System.out.println(c.toString());
	        repo.saveOrUpdate(c);
	        
	        
	}
}
