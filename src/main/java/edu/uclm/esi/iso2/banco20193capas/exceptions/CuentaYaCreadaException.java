package edu.uclm.esi.iso2.banco20193capas.exceptions;

public class CuentaYaCreadaException extends Exception {
	static final long serialVersionUID = 1L;
	public CuentaYaCreadaException() {
		super("La cuenta está creada y no admite añadir titulares");
	}
}
