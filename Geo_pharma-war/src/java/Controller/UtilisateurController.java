/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import entities.Utilisateur;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sessions.UtilisateurFacade;

/**
 *
 * @author Kuidja Marco
 */
@Named
@javax.faces.view.ViewScoped
public class UtilisateurController implements Serializable {

    @EJB
    private Utilisateur utilisateur;
    private UtilisateurFacade utilisateurFacade;
    private List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();

    public UtilisateurController() {
    }

    public String utilisateur() {
        return "utiliasteur.xhtml?faces-redirect=true";
    }

    public int countUser() {
        return utilisateurFacade.count();
    }

    public List<Utilisateur> loadUtilisateurs() {
        utilisateurs.clear();
        utilisateurs.addAll(utilisateurFacade.findAll());
        utilisateur = new Utilisateur();
        return utilisateurs;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

}
