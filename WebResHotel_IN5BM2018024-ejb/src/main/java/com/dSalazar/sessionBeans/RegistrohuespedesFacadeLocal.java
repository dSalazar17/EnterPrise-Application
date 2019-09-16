/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dSalazar.sessionBeans;

import com.dSalazar.entites.Registrohuespedes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Dylan Salazar
 */
@Local
public interface RegistrohuespedesFacadeLocal {

    void create(Registrohuespedes registrohuespedes);

    void edit(Registrohuespedes registrohuespedes);

    void remove(Registrohuespedes registrohuespedes);

    Registrohuespedes find(Object id);

    List<Registrohuespedes> findAll();

    List<Registrohuespedes> findRange(int[] range);

    int count();
    
}
