package pe.edu.upc.meetus.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pe.edu.upc.meetus.model.entity.Meeting;
import pe.edu.upc.meetus.model.repository.MeetingRepository;

// Sirve para hacer la inyección de dependencias e instancia el objeto de abajo
// para iniciarlo cuando esté listo
@Named
@ApplicationScoped // el alcance del named es de toda la clase
public class MeetingRepositoryImpl implements MeetingRepository {

	@PersistenceContext(unitName = "meetusPU")
	private EntityManager entityManager;

	@Override
	public EntityManager getEntityManager() {
		return this.entityManager;
	}

	@Override
	public Optional<Meeting> findById(Integer id) throws Exception {
		return this.findById(id, Meeting.class);
	}

	@Override
	public List<Meeting> findAll() throws Exception {
		String jpql = "SELECT meeting FROM Meeting meeting";
		return this.findByQuery(Meeting.class, jpql);
	}

	@Override
	public List<Meeting> findByData(String data) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Meeting> findByName(String name) throws Exception {
		String jpql = "SELECT meeting FROM Meeting meeting WHERE meeting.name = '" + name + "'";
		return this.findByQuery(Meeting.class, jpql);
	}

}
