/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import sessions.PharmacieFacadeLocal;
import entities.Pharmacie;
import java.util.ArrayList;
import javax.annotation.PostConstruct;

/**
 *
 * @author Kuidja Marco
 */
@Named
@javax.faces.view.ViewScoped
public class PharmacieController implements Serializable {

    @EJB
    private PharmacieFacadeLocal pharmacieFacade;
    private List<Pharmacie> pharmacies = new ArrayList<Pharmacie>();
    private Pharmacie pharmacie;

    public PharmacieController() {
    }

    public int countPharmacies() {
        return pharmacieFacade.count();
    }

    public List<Pharmacie> loadharmacies() {
        pharmacies.clear();
        pharmacies.addAll(pharmacieFacade.findAll());
        pharmacie = new Pharmacie();
        return pharmacies;
    }

    public String pharmacie() {
        return "pharmacie.xhtml?faces-redirect=true";
    }

    public List<Pharmacie> getPharmacies() {
        return pharmacies;
    }

    public void setPharmacies(List<Pharmacie> pharmacies) {
        this.pharmacies = pharmacies;
    }

    public Pharmacie getPharmacie() {
        return pharmacie;
    }

    public void setPharmacie(Pharmacie pharmacie) {
        this.pharmacie = pharmacie;
    }

}
