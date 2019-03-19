package com.collections.excercise.comparableandcomparator;

import java.util.Comparator;

public class LastnameComparator  implements Comparator{
	public int compare(Object emp,Object emp2) {
		 String lastName1 = ((Employee) emp).getLastname().toUpperCase();
		    String firstName1 = ((Employee) emp).getFirstname().toUpperCase();
		    String lastName2 = ((Employee) emp2).getLastname().toUpperCase();
		    String firstName2 = ((Employee) emp2).getFirstname().toUpperCase();
		    if (!(lastName1.equals(lastName2)))
		        return lastName1.compareTo(lastName2);
		      else
		        return firstName1.compareTo(firstName2);
	}
}
