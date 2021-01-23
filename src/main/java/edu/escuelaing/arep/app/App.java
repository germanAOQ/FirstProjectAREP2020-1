package edu.escuelaing.arep.app;

import edu.escuelaing.arep.stat.Stat;
import edu.escuelaing.arep.stat.exceptions.StatException;
import edu.escuelaing.arep.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	    	
        LinkedList<Double> lista = new LinkedList<Double>();
        lista.add(160.0);
        lista.add(591.0);
        lista.add(114.0);
        lista.add(229.0);
        lista.add(230.0);
        lista.add(270.0);
        lista.add(128.0);
        lista.add(1657.0);
        lista.add(624.0);
        lista.add(1503.0);
        lista.remove(591.0);
        for(Double d: lista) {
			System.out.println(d);
		}
        
    }
}
