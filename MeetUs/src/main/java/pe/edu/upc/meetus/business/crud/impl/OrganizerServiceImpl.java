package pe.edu.upc.meetus.business.crud.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.meetus.business.crud.OrganizerService;
import pe.edu.upc.meetus.model.entity.Organizer;
import pe.edu.upc.meetus.model.repository.JpaRepository;
import pe.edu.upc.meetus.model.repository.OrganizerRepository;

@Named
@ApplicationScoped
public class OrganizerServiceImpl implements OrganizerService {

	@Inject
	private OrganizerRepository organizerRepository;

	@Override
	public JpaRepository<Organizer, Integer> getJpaRepository() {
		return this.organizerRepository;
	}

	@Override
	public List<Organizer> findByNameAndLastName(String name, String lastName) throws Exception {
		return this.organizerRepository.findByNameAndLastName(name, lastName);
	}

}
