/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Horaire;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kuidja Marco
 */
@Stateless
public class HoraireFacade extends AbstractFacade<Horaire> implements HoraireFacadeLocal {

    @PersistenceContext(unitName = "Geo_pharma-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HoraireFacade() {
        super(Horaire.class);
    }
    
}
