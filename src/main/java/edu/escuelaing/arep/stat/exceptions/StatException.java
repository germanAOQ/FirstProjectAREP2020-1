package edu.escuelaing.arep.stat.exceptions;

public class StatException extends Exception{
	public static final String DIVISION_CERO = "El cociente de la divisi�n es igual a cero";
	public StatException(String message) {
		super(message);
	}
}
