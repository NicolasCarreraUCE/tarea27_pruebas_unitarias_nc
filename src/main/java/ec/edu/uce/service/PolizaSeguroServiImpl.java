package ec.edu.uce.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.PolizaSeguro;
import ec.edu.uce.repository.IPolizaSeguroRepo;

@Service
public class PolizaSeguroServiImpl implements IPolizaSeguroServi {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private IPolizaSeguroRepo polizaSeguroRepo;
	
	@Override
	@Transactional
	public boolean insertarPolizaSeguro(PolizaSeguro polizaSeguro) {
		// TODO Auto-generated method stub
		try {
			return this.polizaSeguroRepo.insertarPolizaSeguro(polizaSeguro);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public PolizaSeguro buscarPolizaSeguro(Integer id) {
		// TODO Auto-generated method stub
		return this.polizaSeguroRepo.buscarPolizaSeguro(id);
	}

	@Override
	public void actualizarPolizaSeguro(PolizaSeguro polizaSeguro) {
		// TODO Auto-generated method stub
		this.polizaSeguroRepo.actualizarPolizaSeguro(polizaSeguro);
	}

	@Override
	public void borrarPolizaSeguro(Integer id) {
		// TODO Auto-generated method stub
		this.polizaSeguroRepo.borrarPolizaSeguro(id);
	}

}
