/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Horaire;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kuidja Marco
 */
@Local
public interface HoraireFacadeLocal {

    void create(Horaire horaire);

    void edit(Horaire horaire);

    void remove(Horaire horaire);

    Horaire find(Object id);

    List<Horaire> findAll();

    List<Horaire> findRange(int[] range);

    int count();
    
}
