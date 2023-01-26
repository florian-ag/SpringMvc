package fr.formation.inti.model;

import javax.validation.constraints.Size;

public class Nom {

//	@Size(min = 1, message="required")
	private String nom;
	private String prenom;
	private Boolean B;
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;

	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Boolean getB() {
		return B;
	}

	public void setB(Boolean b) {
		B = b;
	}

	public Boolean isB() {
		return B;
	}

	
}