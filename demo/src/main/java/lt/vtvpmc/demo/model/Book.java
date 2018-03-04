package lt.vtvpmc.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class Book {
	@NotNull
	private String title;
	@NotNull
	@Length(min = 2, max = 100)
	private String author;
	@NotNull
	private int noOfPages;
	private List<Rating> ratings = new ArrayList<Rating>();
	
	public Book() {
		
	}
	
	public Book(String title, String author, int noOfPages) {
		this.title = title;
		this.author = author;
		this.noOfPages = noOfPages;
		this.ratings = new ArrayList<Rating>();
	}


	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	
	public void addRating(Rating rating) {
	this.ratings.add(rating);
}

	public double getAverageRatingScore() {
	int totalRatingScore = 0;
	if(ratings.size()>0) {
	for(Rating rating: ratings) {
		totalRatingScore+=rating.getScore();
	}
	return (double)totalRatingScore/ratings.size();
	}else {
		return 0.0;
	}
}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	public String toString() {
		return "'" + this.title + "' written by " + this.author + " (" + this.noOfPages + " pages).";
	}
	
	

}
