package TeamProject;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getRatingpercentage() < o2.getRatingpercentage())
			return 1;
		else if(o1.getRatingpercentage() > o2.getRatingpercentage())
			return -1;
		return 0;
	}

}