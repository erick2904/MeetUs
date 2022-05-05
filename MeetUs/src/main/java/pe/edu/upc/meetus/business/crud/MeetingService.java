package pe.edu.upc.meetus.business.crud;

import java.util.List;

import pe.edu.upc.meetus.model.entity.Meeting;

public interface MeetingService extends CrudService<Meeting, Integer > {
	List<Meeting> findByName(String name) throws Exception;
}
