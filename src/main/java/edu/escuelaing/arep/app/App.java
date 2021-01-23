package edu.escuelaing.arep.app;

import edu.escuelaing.arep.stat.Stat;
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
        lista.add(15.0);
        lista.add(69.9);
        lista.add(6.5);
        lista.add(22.4);
        lista.add(28.4);
        lista.add(65.9);
        lista.add(19.4);
        lista.add(198.7);
        lista.add(38.8);
        lista.add(138.2);
        System.out.println(Stat.mean(lista));
        
    }
}
