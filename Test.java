package TeamProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;


public abstract class Test {

	public static void main(String[] args) throws IOException {
	
		
				
		Scanner reader = new Scanner(System.in);
		
		String file = "C:\\Users\\Nickn\\eclipse-workspace/CPS2232_Spring2021/src/TeamProject/MovieList";

		BufferedReader read = new BufferedReader(new FileReader(file));
		
		
		
		PriorityQueue<Movie> sv = new PriorityQueue<Movie>(5, new StudentviewsComparator());
		PriorityQueue<Movie> r = new PriorityQueue<Movie>(5, new RatingComparator());
		PriorityQueue<Movie> ar = new PriorityQueue<Movie>(5, new AveratingComparator());
		PriorityQueue<Movie> ry = new PriorityQueue<Movie>(5, new ReleaseyearComparator());
		
		String line;
		
		while((line = read.readLine())!=null) {
			while ((line = read.readLine())!= null) {
				 Movie m1 = new Movie();
				 	String[] split = line.split("/s+ ");
				 	m1.setAverating(Double.parseDouble(split[1]));
				 	m1.setStudentViews(Integer.parseInt(split[1]));
				 	m1.setRatingpercentage(Double.parseDouble(split[2]));
				 	m1.setMovie(split[3]);
				 	m1.setReleaseyear(Integer.parseInt(split[4]));
				 	sv.add(m1);
				 	r.add(m1);
				 	ar.add(m1);
				 	ry.add(m1);
				}
		}
		
			
		
		System.out.println("How would you like the Movies to be sorted?"+"Highest Percentage\n"+"Most Viewed\n"+"Highest Rating\n"+"Latest Movie");
		
		
		int decide;

		
		boolean quit = false;
		
		do {
			System.out.print("Choose menu item: ");
			decide = reader.nextInt();
			switch(decide) {
			
			
			
			case 1:
				while(!sv.isEmpty()) {
					Movie rn = sv.poll();
					System.out.println(rn.getMovie()+" "+ rn.getAverating()+" "+rn.getStudentviews()+" "+rn.getReleaseyear());
			}break;
			
			
			
			
			case 2:
				while(!r.isEmpty()) {
					Movie rn = r.poll();
					System.out.println(rn.getMovie()+" "+ rn.getAverating()+" "+rn.getStudentviews()+" "+rn.getReleaseyear());

				}break;
				
				
				
				
			case 3:
				while(!ar.isEmpty()) {
					Movie rn = ar.poll();
					System.out.println(rn.getMovie()+" "+ rn.getAverating()+" "+rn.getStudentviews()+" "+rn.getReleaseyear());
			}break;
		
		
		
		
			case 4:
				while(!ry.isEmpty()) {
					Movie rn = ry.poll();
					System.out.println(rn.getMovie()+" "+ rn.getAverating()+" "+rn.getStudentviews()+" "+rn.getReleaseyear());
				}break;
		
		
		
			case 0:
				quit = true;
				break;
				default:
					System.out.println("Invalid");
			
			}
			
		}while(!quit);
	}
}