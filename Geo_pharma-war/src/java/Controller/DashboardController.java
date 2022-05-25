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

/**
 *
 * @author Kuidja Marco
 */
@Named
@javax.faces.view.ViewScoped
public class DashboardController {

    @EJB
    private PharmacieController pharmacieController;
    private UtilisateurController utilisateurController;
    private int nombreDePharmacie;
    private int nombreDeUtilisateur;

    public DashboardController() {
        nombreDeUtilisateur = utilisateurController.countUser();
        nombreDePharmacie = pharmacieController.countPharmacies();
    }

    public String dashboard() {
        return "dashboard.xhtml";
    }

    public int getNombreDePharmacie() {
        return nombreDePharmacie;
    }

    public void setNombreDePharmacie(int nombreDePharmacie) {
        this.nombreDePharmacie = nombreDePharmacie;
    }

    public int getNombreDeUtilisateur() {
        return nombreDeUtilisateur;
    }

    public void setNombreDeUtilisateur(int nombreDeUtilisateur) {
        this.nombreDeUtilisateur = nombreDeUtilisateur;
    }
}
