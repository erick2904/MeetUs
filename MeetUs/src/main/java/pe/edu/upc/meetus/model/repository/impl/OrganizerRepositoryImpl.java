package pe.edu.upc.meetus.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pe.edu.upc.meetus.model.entity.Meeting;
import pe.edu.upc.meetus.model.entity.Organizer;
import pe.edu.upc.meetus.model.repository.OrganizerRepository;

@Named
@ApplicationScoped
public class OrganizerRepositoryImpl implements OrganizerRepository {

	@PersistenceContext(unitName = "meetusPU")
	private EntityManager entityManager;

	@Override
	public EntityManager getEntityManager() {
		return this.entityManager;
	}

	@Override
	public Optional<Organizer> findById(Integer id) throws Exception {
		return this.findById(id, Organizer.class);
	}

	@Override
	public List<Organizer> findAll() throws Exception {
		String jpql = "SELECT organizer FROM Organizer organizer";
		return this.findByQuery(Organizer.class, jpql);
	}

	@Override
	public List<Organizer> findByData(String data) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Organizer> findByNameAndLastName(String name, String lastName) throws Exception {
		String jpql = "SELECT organizer FROM Organizer organizer WHERE organizer.name = '" + name + "' and organizer.last_name = '" + lastName + "'";
		return this.findByQuery(Organizer.class, jpql);
	}

}
