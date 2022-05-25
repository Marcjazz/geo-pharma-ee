/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kuidja Marco
 */
@Entity
@Table(name = "pharmacie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pharmacie.findAll", query = "SELECT p FROM Pharmacie p")
    , @NamedQuery(name = "Pharmacie.findByIdpharmacie", query = "SELECT p FROM Pharmacie p WHERE p.idpharmacie = :idpharmacie")
    , @NamedQuery(name = "Pharmacie.findByNom", query = "SELECT p FROM Pharmacie p WHERE p.nom = :nom")
    , @NamedQuery(name = "Pharmacie.findByDescription", query = "SELECT p FROM Pharmacie p WHERE p.description = :description")
    , @NamedQuery(name = "Pharmacie.findByLongitude", query = "SELECT p FROM Pharmacie p WHERE p.longitude = :longitude")
    , @NamedQuery(name = "Pharmacie.findByLatitude", query = "SELECT p FROM Pharmacie p WHERE p.latitude = :latitude")})
public class Pharmacie implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "image_ref")
    private String imageRef;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpharmacie")
    private Integer idpharmacie;
    @Size(max = 30)
    @Column(name = "nom")
    private String nom;
    @Size(max = 254)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "longitude")
    private int longitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "latitude")
    private int latitude;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpharmacie")
    private Collection<Horaire> horaireCollection;
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateur")
    @ManyToOne(optional = false)
    private Utilisateur idutilisateur;

    public Pharmacie() {
    }

    public Pharmacie(Integer idpharmacie) {
        this.idpharmacie = idpharmacie;
    }

    public Pharmacie(Integer idpharmacie, int longitude, int latitude) {
        this.idpharmacie = idpharmacie;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Integer getIdpharmacie() {
        return idpharmacie;
    }

    public void setIdpharmacie(Integer idpharmacie) {
        this.idpharmacie = idpharmacie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    @XmlTransient
    public Collection<Horaire> getHoraireCollection() {
        return horaireCollection;
    }

    public void setHoraireCollection(Collection<Horaire> horaireCollection) {
        this.horaireCollection = horaireCollection;
    }

    public Utilisateur getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Utilisateur idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpharmacie != null ? idpharmacie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pharmacie)) {
            return false;
        }
        Pharmacie other = (Pharmacie) object;
        if ((this.idpharmacie == null && other.idpharmacie != null) || (this.idpharmacie != null && !this.idpharmacie.equals(other.idpharmacie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pharmacie[ idpharmacie=" + idpharmacie + " ]";
    }

    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }
    
}
