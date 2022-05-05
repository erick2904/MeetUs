package pe.edu.upc.meetus.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import javax.faces.view.ViewScoped;

@Named("organizerView")
@ViewScoped
public class OrganizerView implements Serializable{
	private static final long serialVersionUID = 1L;
	private String text;

	@PostConstruct // Primer método que carga al cargar la página
	public void init() {
		this.text = "Web Programming";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
