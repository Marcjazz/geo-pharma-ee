/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Pharmacie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kuidja Marco
 */
@Local
public interface PharmacieFacadeLocal {

    void create(Pharmacie pharmacie);

    void edit(Pharmacie pharmacie);

    void remove(Pharmacie pharmacie);

    Pharmacie find(Object id);

    List<Pharmacie> findAll();

    List<Pharmacie> findRange(int[] range);

    int count();
    
}
