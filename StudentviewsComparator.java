package TeamProject;

import java.util.Comparator;

public class StudentviewsComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getStudentviews() < o2.getStudentviews())
			return 1;
		else if(o1.getStudentviews() > o2.getStudentviews())
			return -1;
		return 0;
	}

}