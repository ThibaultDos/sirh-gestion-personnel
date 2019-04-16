package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class CreerCollaborateursController extends HttpServlet {
	
	//récupération du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateurs.jsp").forward(req, resp);
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		
		String matricule = req.getParameter("inputPrenom"+"."+"inputNom");
		String nom = req.getParameter("inputNom");
		String prenom = req.getParameter("inputPrenom");
				
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		formatter = formatter.withLocale(Locale.FRANCE);
		LocalDate date = LocalDate.parse(req.getParameter("inputBirthday"), formatter);		
		LocalDate dateNaissance = date;		
		
		String adresse = req.getParameter("inputAdresse");
		String numeroSecu = req.getParameter("inputNumSecu");		
		String emailPro = req.getParameter("inputPrenom"+"."+"inputNom"+"@societe.com");
		String photo = null;
		ZonedDateTime dateHeureCreation = ZonedDateTime.now();
		Boolean actif = true;
		
		
		
		Collaborateur collab = new Collaborateur(matricule, nom, prenom, dateNaissance, adresse, numeroSecu, emailPro, photo, dateHeureCreation, actif);
		collabService.sauvegarderCollaborateur(collab);
		
		req.setAttribute("listeCollaborateurs", collabService.listerCollaborateurs());
		req.getRequestDispatcher("/collaborateurs/lister").forward(req, resp);
		
	}
}
