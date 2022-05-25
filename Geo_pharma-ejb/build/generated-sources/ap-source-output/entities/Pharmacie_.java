package entities;

import entities.Horaire;
import entities.Utilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-05-25T22:17:52")
@StaticMetamodel(Pharmacie.class)
public class Pharmacie_ { 

    public static volatile SingularAttribute<Pharmacie, Utilisateur> idutilisateur;
    public static volatile SingularAttribute<Pharmacie, Integer> latitude;
    public static volatile SingularAttribute<Pharmacie, String> description;
    public static volatile SingularAttribute<Pharmacie, String> imageRef;
    public static volatile SingularAttribute<Pharmacie, Integer> idpharmacie;
    public static volatile SingularAttribute<Pharmacie, String> nom;
    public static volatile SingularAttribute<Pharmacie, Integer> longitude;
    public static volatile CollectionAttribute<Pharmacie, Horaire> horaireCollection;

}