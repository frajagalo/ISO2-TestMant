package edu.uclm.esi.iso2.banco20193capas.exceptions;

public class TarjetaBloqueadaException extends Exception {
	private static final long serialVersionUID = 1L;
	public TarjetaBloqueadaException() {
		super("La tarjeta está bloqueada");
	}
}
