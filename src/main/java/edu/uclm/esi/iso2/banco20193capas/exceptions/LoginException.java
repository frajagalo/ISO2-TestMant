package edu.uclm.esi.iso2.banco20193capas.exceptions;

public class LoginException extends Exception { 
	private static final long serialVersionUID = 1L;
	public LoginException() {
		super("Credenciales inválidas");
	}
}
