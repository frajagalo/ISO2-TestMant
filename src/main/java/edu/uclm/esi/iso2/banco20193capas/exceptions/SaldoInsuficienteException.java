package edu.uclm.esi.iso2.banco20193capas.exceptions;

public class SaldoInsuficienteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException() {
		super("Saldo insuficiente para el importe solicitado");
	}
}
