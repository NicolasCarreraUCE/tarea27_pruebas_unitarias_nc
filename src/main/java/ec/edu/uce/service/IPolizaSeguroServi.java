package ec.edu.uce.service;

import ec.edu.uce.modelo.PolizaSeguro;

public interface IPolizaSeguroServi {
	boolean insertarPolizaSeguro(PolizaSeguro polizaSeguro);
	PolizaSeguro buscarPolizaSeguro(Integer id);
	void actualizarPolizaSeguro(PolizaSeguro polizaSeguro);
	void borrarPolizaSeguro(Integer id);
}
