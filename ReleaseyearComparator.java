package TeamProject;

import java.util.Comparator;

public class ReleaseyearComparator implements Comparator <Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getReleaseyear() < o2.getReleaseyear())
			return 1;
		else if ( o1.getReleaseyear() > o2.getReleaseyear())
			return -1;
		return 0;
	}

}