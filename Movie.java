package TeamProject;

public class Movie {
	
	public double ratingPercentage;
	public int studentViews;
	public double aveRating;
	public String movie;
	public int releaseYear;
	
	
	public Movie(double ratingPercentage, int studentViews, double aveRating, String movie, int releaseYear){
		
		super();
		this.ratingPercentage = ratingPercentage;
		this.studentViews = studentViews;
		this.aveRating = aveRating;
		this.movie = movie;
		this.releaseYear = releaseYear;
	}
		
	//Rating Percentage Getters/Setters



	public double getRatingpercentage() {
		return ratingPercentage;
	}
	
	public void setRatingpercentage(double ratingPercentage) {
		this.ratingPercentage = ratingPercentage;
	}
	
	
	
	//Student Views Getters/Setters
	
	public int getStudentviews() {
		return studentViews;
	}
	
	
	public void setStudentViews(int studentViews) {
		this.studentViews = studentViews;
	}
	
	
	//Average Rating Getters/Setter
	
	public double getAverating() {
		return aveRating;
	}
	
	public void setAverating(double aveRating) {
		this.aveRating = aveRating;
	}
	
	
	
	//Movie Getters/Setters
	
	public String getMovie() {
		return movie;
	}
	
	public void setMovie(String movie) {
		this.movie = movie;
	}
	
	
	//Release Year Getter/Setters
	
	public int getReleaseyear() {
		return releaseYear;
	}
	
	
	public void setReleaseyear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	
	@Override
	public String toString() {
		return "Movie[rating ="+ratingPercentage+"studentViews ="+studentViews+"aveRating ="+aveRating+"movie= "+movie+"releaseYear="+releaseYear;
	}
	
	
	






	public Movie() {
		// TODO Auto-generated constructor stub
	}
}