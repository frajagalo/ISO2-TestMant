package edu.uclm.esi.iso2.banco20193capas.exceptions;

public class CuentaInvalidaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CuentaInvalidaException(Long numero) {
		super("La cuenta " + numero + " no existe");
	}

}
