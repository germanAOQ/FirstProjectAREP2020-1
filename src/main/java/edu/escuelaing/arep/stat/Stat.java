package edu.escuelaing.arep.stat;

import java.util.List;

public class Stat {
	
	public static Double mean(List<Double> lval) {
		Double suma = 0.0;
		for(Double e: lval) {
			suma = suma + e;
		}
		return suma / lval.size();
	}
}
