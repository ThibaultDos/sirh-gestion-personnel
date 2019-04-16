package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {	
	String matricule;
	String nom;
	String prenom;
	LocalDate dateNaissance;
	String Adresse;
	String numeroSecu;
	String emailPro;
	String photo;
	ZonedDateTime dateHeureCreation;
	Boolean actif;
	/**
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param adresse
	 * @param numeroSecu
	 * @param emailPro
	 * @param photo
	 * @param dateHeureCreation
	 * @param actif
	 */
	public Collaborateur(String matricule, String nom, String prenom, LocalDate dateNaissance, String adresse,
			String numeroSecu, String emailPro, String photo, ZonedDateTime dateHeureCreation, Boolean actif) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		Adresse = adresse;
		this.numeroSecu = numeroSecu;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}
	
	/**
	 * 
	 */
	public Collaborateur() {
		super();
	}

	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}
	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return Adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	/**
	 * @return the numeroSecu
	 */
	public String getNumeroSecu() {
		return numeroSecu;
	}
	/**
	 * @param numeroSecu the numeroSecu to set
	 */
	public void setNumeroSecu(String numeroSecu) {
		this.numeroSecu = numeroSecu;
	}
	/**
	 * @return the emailPro
	 */
	public String getEmailPro() {
		return emailPro;
	}
	/**
	 * @param emailPro the emailPro to set
	 */
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}
	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	/**
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}
	/**
	 * @param dateHeureCreation the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}
	/**
	 * @return the actif
	 */
	public Boolean getActif() {
		return actif;
	}
	/**
	 * @param actif the actif to set
	 */
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	
}

