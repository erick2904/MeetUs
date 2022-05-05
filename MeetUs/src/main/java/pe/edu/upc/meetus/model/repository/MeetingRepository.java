package pe.edu.upc.meetus.model.repository;

import java.util.List;

import pe.edu.upc.meetus.model.entity.Meeting;

public interface MeetingRepository extends JpaRepository<Meeting, Integer> {
	List<Meeting> findByName(String name) throws Exception;
}
