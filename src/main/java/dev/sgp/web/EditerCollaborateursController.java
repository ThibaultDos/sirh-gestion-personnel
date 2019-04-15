package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;


public class EditerCollaborateursController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// recupere la valeur d'un parametre dont le nom est matricule
		String matriculeParam = req.getParameter("matricule");		
	
		if (StringUtils.isEmpty(matriculeParam)){
			resp.setContentType("text/html");
			resp.getWriter().write("<h1>I AM ERROR (400)</h1>"
					+ "un matricule est attendu");
			resp.setStatus(400);
		}
		else if (StringUtils.isNotEmpty(matriculeParam)){
			
			resp.setContentType("text/html");
			resp.setStatus(400);
			resp.getWriter().write("<h1>Édition de collaborateur</h1>"
					+ "<ul>"
					+ "<li>matricule="+ matriculeParam + "</li>"
					+ "</ul>");
		}
		
		
		else resp.getWriter().write("<h1>w00t !?</h1>");

	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {	
		// recupere la valeur d'un parametre dont le nom est matricule
		String matriculeParam = req.getParameter("matricule");		
		// recupere la valeur d'un parametre dont le nom est titre
		String titreParam = req.getParameter("titre");
		// recupere la valeur d'un parametre dont le nom est nom
		String nomParam = req.getParameter("nom");
		// recupere la valeur d'un parametre dont le nom est prenom
		String prenomParam = req.getParameter("prenom");	
		
		if (StringUtils.isEmpty(matriculeParam) || StringUtils.isEmpty(titreParam) || StringUtils.isEmpty(nomParam) || StringUtils.isEmpty(prenomParam)){
			resp.setContentType("text/html");
			resp.getWriter().write("<h1>I AM ERROR (400)</h1>"
					+ "<ul>"
					+ "<li>un matricule est attendu</li>"
					+ "<li>un titre est attendu</li>"
					+ "<li>un nom est attendu</li>"
					+ "<li>un prenom est attendu</li>"
					+ "</ul>");
			resp.setStatus(400);
		}
		else if (StringUtils.isNotEmpty(matriculeParam) && StringUtils.isNotEmpty(titreParam) && StringUtils.isNotEmpty(nomParam) && StringUtils.isNotEmpty(prenomParam)){
			resp.setContentType("text/html");
			resp.setStatus(201);
			resp.getWriter().write("<h1>Création d’un collaborateur avec les informations suivantes : </h1>"
					+ "<ul>"
					+ "<li>matricule="+ matriculeParam + "</li>"
					+ "<li>titre="+ titreParam + "</li>"
					+ "<li>nom="+ nomParam + "</li>"
					+ "<li>prénom="+ prenomParam + "</li>"
					+ "</ul>");
		}
		
		
		else {
			resp.getWriter().write("<h1>w00t !?</h1>");
		}
	}
}
