package dev.sgp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections4.CollectionUtils;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class ListerCollaborateursController extends HttpServlet {

	// récupération du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();

		if (CollectionUtils.isNotEmpty(collaborateurs)) {
			req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
			// utilisation du service
			req.setAttribute("listeCollaborateurs", collaborateurs);
		} else {
			resp.setContentType("text/html");
			resp.getWriter().write("<h1>I AM ERROR.</h1>"
					+ "<h2>aucun collaborateur enregistré</h2>");
		}	
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
		
		if (CollectionUtils.isNotEmpty(collaborateurs)) {
			req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
			// utilisation du service
			req.setAttribute("listeCollaborateurs", collaborateurs);
		} else {
			resp.setContentType("text/html");
			resp.getWriter().write("<h1>I AM ERROR.</h1>"
					+ "<h2>aucun collaborateur enregistré</h2>");
		}	
		
	}
}
