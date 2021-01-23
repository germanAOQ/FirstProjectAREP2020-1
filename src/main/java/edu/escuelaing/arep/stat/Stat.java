package edu.escuelaing.arep.stat;

import java.util.List;

import edu.escuelaing.arep.stat.exceptions.StatException;

public class Stat {
	
	public static Double mean(List<Double> lval) throws StatException{
		if(lval.size() == 0) throw new StatException(StatException.DIVISION_CERO);
		Double suma = 0.0;
		for(Double e: lval) {
			suma = suma + e;
		}
		Double mean = suma / lval.size();
		return Math.round(mean*100.0)/100.0;
	}
	
	public static Double stddev(List<Double> lval) throws StatException{
		if(lval.size() == 0) throw new StatException(StatException.DIVISION_CERO);
		Double mean = mean(lval);
		Double suma = 0.0;
		for(Double valor: lval) {
			suma = suma + Math.pow((valor - mean), 2);
		}
		Double div = suma / (lval.size()-1);
		Double deviation = Math.sqrt(div);
		return Math.round(deviation*100.0)/100.0;
	}
}
