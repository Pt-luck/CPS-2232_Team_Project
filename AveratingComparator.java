package TeamProject;

import java.util.Comparator;

public class AveratingComparator implements Comparator <Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getAverating() < o2.getAverating())
			return -1;
		else if(o1.getAverating() > o2.getAverating())
			return -1;
		return 0;
	}

}