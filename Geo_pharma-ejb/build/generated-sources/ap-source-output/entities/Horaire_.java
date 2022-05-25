package entities;

import entities.Pharmacie;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-05-25T22:17:52")
@StaticMetamodel(Horaire.class)
public class Horaire_ { 

    public static volatile SingularAttribute<Horaire, Date> heureFermeture;
    public static volatile SingularAttribute<Horaire, Integer> idhoraire;
    public static volatile SingularAttribute<Horaire, Short> jourSemaine;
    public static volatile SingularAttribute<Horaire, Date> heureOuverture;
    public static volatile SingularAttribute<Horaire, Pharmacie> idpharmacie;

}