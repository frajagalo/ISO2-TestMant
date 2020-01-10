package edu.uclm.esi.iso2.banco20193capas.exceptions;

public class CuentaSinTitularesException extends Exception {
	private static final long serialVersionUID = 1L;
	public CuentaSinTitularesException() {
		super("Falta indicar el titular o titulares");
	}
}
