package edu.uclm.esi.iso2.banco20193capas.exceptions;

public class PinInvalidoException extends Exception {
	static final long serialVersionUID = 1L;
	public PinInvalidoException() {
		super("PIN inválido");
	}
}
