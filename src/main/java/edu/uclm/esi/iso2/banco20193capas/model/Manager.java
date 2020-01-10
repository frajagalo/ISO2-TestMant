package edu.uclm.esi.iso2.banco20193capas.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.uclm.esi.iso2.banco20193capas.dao.ClienteDAO;
import edu.uclm.esi.iso2.banco20193capas.dao.CuentaDAO;
import edu.uclm.esi.iso2.banco20193capas.dao.MovimientoCuentaDAO;
import edu.uclm.esi.iso2.banco20193capas.dao.MovimientoTarjetaCreditoDAO;
import edu.uclm.esi.iso2.banco20193capas.dao.TarjetaCreditoDAO;
import edu.uclm.esi.iso2.banco20193capas.dao.TarjetaDebitoDAO;

/**
 * El Manager da acceso a las clases DAO asociadas a las clases de dominio
 *
 */
@Component
public final class Manager {
	private static CuentaDAO cuentaDAO;
	private static MovimientoCuentaDAO movimientoDAO;
	private static MovimientoTarjetaCreditoDAO movTCredDAO;
	private static ClienteDAO clienteDAO;
	private static TarjetaDebitoDAO tarjetaDebitoDAO;
	private static TarjetaCreditoDAO tarjetaCreditoDAO;

	private Manager() {	}

	@Autowired
	private void loadDAO(final CuentaDAO cuentaDao,final MovimientoCuentaDAO movimientoDao,final 
			ClienteDAO clienteDAO,final MovimientoTarjetaCreditoDAO movimientoTCDAO,final TarjetaDebitoDAO tarjetaDebitoDAO,final
			TarjetaCreditoDAO tarjetaCreditoDAO) {
		Manager.cuentaDAO = cuentaDao;
		Manager.movimientoDAO = movimientoDao;
		Manager.clienteDAO = clienteDAO;
		Manager.movTCredDAO = movimientoTCDAO;
		Manager.tarjetaDebitoDAO = tarjetaDebitoDAO;
		Manager.tarjetaCreditoDAO = tarjetaCreditoDAO;
	}

	public static CuentaDAO getCuentaDAO() {
		return cuentaDAO;
	}

	public static MovimientoCuentaDAO getMovimientoDAO() {
		return movimientoDAO;
	}

	public static ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public static MovimientoTarjetaCreditoDAO getMovimientoTarjetaCreditoDAO() {
		return movTCredDAO;
	}

	public static TarjetaDebitoDAO getTarjetaDebitoDAO() {
		return tarjetaDebitoDAO;
	}

	public static TarjetaCreditoDAO getTarjetaCreditoDAO() {
		return tarjetaCreditoDAO;
	}
}
