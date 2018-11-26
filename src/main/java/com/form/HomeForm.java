package com.form;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class HomeForm {

	private String title 			= "PrimeFaces + Spring demo";
	private String demoPanel 		= "PrimeFaces + Spring demo";
	private String demoDescription 	= "Demo Spring boot + MVC + PrimeFaces.";
	
	public HomeForm() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDemoPanel() {
		return demoPanel;
	}

	public void setDemoPanel(String demoPanel) {
		this.demoPanel = demoPanel;
	}

	public String getDemoDescription() {
		return demoDescription;
	}

	public void setDemoDescription(String demoDescription) {
		this.demoDescription = demoDescription;
	}

}
