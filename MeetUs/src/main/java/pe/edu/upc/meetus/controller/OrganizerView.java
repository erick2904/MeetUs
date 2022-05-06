package pe.edu.upc.meetus.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.meetus.business.crud.CrudService;
import pe.edu.upc.meetus.business.crud.OrganizerService;
import pe.edu.upc.meetus.model.entity.Organizer;

import javax.faces.view.ViewScoped;

@Named("organizerView")
@ViewScoped
public class OrganizerView implements Serializable, EntityView<Organizer, Integer> {
	private static final long serialVersionUID = 1L;

	private List<Organizer> entities;
	private Organizer entitySelected;
	private List<Organizer> entitiesSelected;
	private Organizer entitySearch;

	@Inject
	private OrganizerService entityService;

	@PostConstruct // Primer método que carga al cargar la página
	public void init() {
		this.entitiesSelected = new ArrayList<>();
		this.entitySearch = new Organizer();
		getAllEntities();

	}

	@Override
	public CrudService<Organizer, Integer> getCrudService() {
		return this.entityService;
	}

	@Override
	public void createNew() {
		this.entitySelected = new Organizer();

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

	public List<Organizer> getEntities() {
		return entities;
	}

	public void setEntities(List<Organizer> entities) {
		this.entities = entities;
	}

	public Organizer getEntitySelected() {
		return entitySelected;
	}

	public void setEntitySelected(Organizer entitySelected) {
		this.entitySelected = entitySelected;
	}

	public List<Organizer> getEntitiesSelected() {
		return entitiesSelected;
	}

	public void setEntitiesSelected(List<Organizer> entitiesSelected) {
		this.entitiesSelected = entitiesSelected;
	}

	public Organizer getEntitySearch() {
		return entitySearch;
	}

	public void setEntitySearch(Organizer entitySearch) {
		this.entitySearch = entitySearch;
	}

	public OrganizerService getEntityService() {
		return entityService;
	}

	public void setEntityService(OrganizerService entityService) {
		this.entityService = entityService;
	}

}
