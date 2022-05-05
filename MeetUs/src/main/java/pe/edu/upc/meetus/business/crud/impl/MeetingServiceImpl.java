package pe.edu.upc.meetus.business.crud.impl;

import javax.inject.Inject;
import javax.inject.Named;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import pe.edu.upc.meetus.business.crud.MeetingService;
import pe.edu.upc.meetus.model.entity.Meeting;
import pe.edu.upc.meetus.model.repository.JpaRepository;
import pe.edu.upc.meetus.model.repository.MeetingRepository;

@Named
@ApplicationScoped
public class MeetingServiceImpl implements MeetingService {

	@Inject
	private MeetingRepository meetingRepository;
	
	@Override
	public JpaRepository<Meeting, Integer> getJpaRepository() {
		return this.meetingRepository;
	}

	@Override
	public List<Meeting> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
