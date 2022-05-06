package pe.edu.upc.meetus.controller;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.meetus.business.crud.CrudService;
import pe.edu.upc.meetus.business.crud.MeetingService;
import pe.edu.upc.meetus.model.entity.Meeting;
import pe.edu.upc.meetus.model.entity.Organizer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("meetingView")
@ViewScoped
public class MeetingView implements Serializable, EntityView<Meeting, Integer> {
	private static final long serialVersionUID = 1L;

	private List<Meeting> entities;
	private Meeting entitySelected;
	private List<Meeting> entitiesSelected;
	private Meeting entitySearch;

	@Inject
	private MeetingService entityService;

	@PostConstruct
	public void init() {
		this.entitiesSelected = new ArrayList<>();
		this.entitySearch = new Meeting();
		getAllEntities();
	}

	@Override
	public CrudService<Meeting, Integer> getCrudService() {
		return this.entityService;
	}

	@Override
	public void createNew() {
		this.entitySelected = new Meeting();
		this.entitySelected.setOrganizer(new Organizer());
	}

	@Override
	public Integer getIdFromEntitySelected() {
		return this.entitySelected.getId();
	}

	@Override
	public void searchEntity() {
		try {
			this.entities = this.entityService.search(this.entitySearch.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Meeting> getEntities() {
		return entities;
	}

	public void setEntities(List<Meeting> entities) {
		this.entities = entities;
	}

	public Meeting getEntitySelected() {
		return entitySelected;
	}

	public void setEntitySelected(Meeting entitySelected) {
		this.entitySelected = entitySelected;
	}

	public List<Meeting> getEntitiesSelected() {
		return entitiesSelected;
	}

	public void setEntitiesSelected(List<Meeting> entitiesSelected) {
		this.entitiesSelected = entitiesSelected;
	}

	public Meeting getEntitySearch() {
		return entitySearch;
	}

	public void setEntitySearch(Meeting entitySearch) {
		this.entitySearch = entitySearch;
	}

	public MeetingService getEntityService() {
		return entityService;
	}

	public void setEntityService(MeetingService entityService) {
		this.entityService = entityService;
	}
}
