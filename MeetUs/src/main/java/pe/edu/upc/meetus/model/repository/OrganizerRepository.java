package pe.edu.upc.meetus.model.repository;

import java.util.List;

import pe.edu.upc.meetus.model.entity.Organizer;

public interface OrganizerRepository extends JpaRepository<Organizer, Integer> {
	List<Organizer> findByNameAndLastName(String name, String lastName) throws Exception;
}
