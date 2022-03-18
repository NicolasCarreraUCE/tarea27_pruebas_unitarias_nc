package ec.edu.uce.repository;

import ec.edu.uce.modelo.PolizaSeguro;

public interface IPolizaSeguroRepo {
	boolean insertarPolizaSeguro(PolizaSeguro polizaSeguro);
	PolizaSeguro buscarPolizaSeguro(Integer id);
	void actualizarPolizaSeguro(PolizaSeguro polizaSeguro);
	void borrarPolizaSeguro(Integer id);
}
