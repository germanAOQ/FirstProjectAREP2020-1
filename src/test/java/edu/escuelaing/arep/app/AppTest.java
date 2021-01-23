package edu.escuelaing.arep.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;
import edu.escuelaing.arep.stat.Stat;
import edu.escuelaing.arep.stat.exceptions.StatException;
import edu.escuelaing.arep.util.LinkedList;
import edu.escuelaing.arep.util.LinkedListIterator;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void shouldGetMeanColumnOne() {
		Double expected = 550.6;
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
		Double actual = 0.0;
		try {
			actual = Stat.mean(lista);
		} catch (StatException e) {
			e.printStackTrace();
		}
		assertEquals(expected, actual);
	}
	
	@Test
	public void shouldGetMeanColumnTwo() {
		Double expected = 60.32;
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
		Double actual = 0.0;
		try {
			actual = Stat.mean(lista);
		} catch (StatException e) {
			e.printStackTrace();
		}
		assertEquals(expected, actual);
	}
	
	@Test
	public void shouldGetDeviationColumnOne() {
		Double expected = 572.03;
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
		Double actual = 0.0;
		try {
			actual = Stat.stddev(lista);
		} catch (StatException e) {
			e.printStackTrace();
		}
		assertEquals(expected, actual);
	}
	
	@Test
	public void shouldGetDeviationColumnTwo() {
		Double expected = 62.26;
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
		Double actual = 0.0;
		try {
			actual = Stat.stddev(lista);
		} catch (StatException e) {
			e.printStackTrace();
		}
		assertEquals(expected, actual);
	}
}
