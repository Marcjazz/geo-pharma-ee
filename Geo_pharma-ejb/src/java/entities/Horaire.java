/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kuidja Marco
 */
@Entity
@Table(name = "horaire")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horaire.findAll", query = "SELECT h FROM Horaire h")
    , @NamedQuery(name = "Horaire.findByIdhoraire", query = "SELECT h FROM Horaire h WHERE h.idhoraire = :idhoraire")
    , @NamedQuery(name = "Horaire.findByJourSemaine", query = "SELECT h FROM Horaire h WHERE h.jourSemaine = :jourSemaine")
    , @NamedQuery(name = "Horaire.findByHeureOuverture", query = "SELECT h FROM Horaire h WHERE h.heureOuverture = :heureOuverture")
    , @NamedQuery(name = "Horaire.findByHeureFermeture", query = "SELECT h FROM Horaire h WHERE h.heureFermeture = :heureFermeture")})
public class Horaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhoraire")
    private Integer idhoraire;
    @Basic(optional = false)
    @NotNull
    @Column(name = "jour_semaine")
    private short jourSemaine;
    @Column(name = "heure_ouverture")
    @Temporal(TemporalType.TIME)
    private Date heureOuverture;
    @Column(name = "heure_fermeture")
    @Temporal(TemporalType.TIME)
    private Date heureFermeture;
    @JoinColumn(name = "idpharmacie", referencedColumnName = "idpharmacie")
    @ManyToOne(optional = false)
    private Pharmacie idpharmacie;

    public Horaire() {
    }

    public Horaire(Integer idhoraire) {
        this.idhoraire = idhoraire;
    }

    public Horaire(Integer idhoraire, short jourSemaine) {
        this.idhoraire = idhoraire;
        this.jourSemaine = jourSemaine;
    }

    public Integer getIdhoraire() {
        return idhoraire;
    }

    public void setIdhoraire(Integer idhoraire) {
        this.idhoraire = idhoraire;
    }

    public short getJourSemaine() {
        return jourSemaine;
    }

    public void setJourSemaine(short jourSemaine) {
        this.jourSemaine = jourSemaine;
    }

    public Date getHeureOuverture() {
        return heureOuverture;
    }

    public void setHeureOuverture(Date heureOuverture) {
        this.heureOuverture = heureOuverture;
    }

    public Date getHeureFermeture() {
        return heureFermeture;
    }

    public void setHeureFermeture(Date heureFermeture) {
        this.heureFermeture = heureFermeture;
    }

    public Pharmacie getIdpharmacie() {
        return idpharmacie;
    }

    public void setIdpharmacie(Pharmacie idpharmacie) {
        this.idpharmacie = idpharmacie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhoraire != null ? idhoraire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horaire)) {
            return false;
        }
        Horaire other = (Horaire) object;
        if ((this.idhoraire == null && other.idhoraire != null) || (this.idhoraire != null && !this.idhoraire.equals(other.idhoraire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Horaire[ idhoraire=" + idhoraire + " ]";
    }
    
}
