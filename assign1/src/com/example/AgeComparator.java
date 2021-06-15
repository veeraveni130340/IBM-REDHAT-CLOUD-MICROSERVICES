package com.example;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employe> {

	@Override
	public int compare(Employe e1, Employe e2) {
		if (e1.getAge() < e2.getAge())
			return -1;
		if (e1.getAge() > e2.getAge())
			return 1;
		else
			return 0;
	}

}
