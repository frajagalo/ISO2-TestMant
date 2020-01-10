package edu.uclm.esi.iso2.banco20193capas.exceptions;

public class ClienteNoAutorizadoException extends Exception {
	private static final long serialVersionUID = 1L;
	public ClienteNoAutorizadoException(final String nif,final Long idCliente) {
		super("El cliente con NIF " + nif + " no está autorizado para operar en la cuenta " + idCliente);
	}
}
