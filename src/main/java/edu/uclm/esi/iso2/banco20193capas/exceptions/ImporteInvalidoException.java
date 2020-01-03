package edu.uclm.esi.iso2.banco20193capas.exceptions;

public class ImporteInvalidoException extends Exception {
	static final long serialVersionUID = 1L;
	public ImporteInvalidoException(double importe) {
		super("El importe " + importe + " no es válido para esta operación");
	}
}
