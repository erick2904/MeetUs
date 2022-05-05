package pe.edu.upc.meetus.controller;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("meetingView")
@ViewScoped
public class MeetingView implements Serializable {
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
