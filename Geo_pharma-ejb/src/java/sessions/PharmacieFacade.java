/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Pharmacie;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kuidja Marco
 */
@Stateless
public class PharmacieFacade extends AbstractFacade<Pharmacie> implements PharmacieFacadeLocal {

    @PersistenceContext(unitName = "Geo_pharma-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PharmacieFacade() {
        super(Pharmacie.class);
    }
    
}
