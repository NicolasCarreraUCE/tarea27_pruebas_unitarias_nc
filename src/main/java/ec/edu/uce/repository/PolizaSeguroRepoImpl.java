package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.PolizaSeguro;

@Repository
@Transactional
public class PolizaSeguroRepoImpl implements IPolizaSeguroRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public boolean insertarPolizaSeguro(PolizaSeguro polizaSeguro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(polizaSeguro);
		return true;
	}

	@Override
	public PolizaSeguro buscarPolizaSeguro(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(PolizaSeguro.class, id);
	}

	@Override
	public void actualizarPolizaSeguro(PolizaSeguro polizaSeguro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(polizaSeguro);
	}

	@Override
	public void borrarPolizaSeguro(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarPolizaSeguro(id));
	}

}
