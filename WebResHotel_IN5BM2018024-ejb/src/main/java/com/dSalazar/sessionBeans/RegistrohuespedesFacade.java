/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dSalazar.sessionBeans;

import com.dSalazar.entites.Registrohuespedes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dylan Salazar
 */
@Stateless
public class RegistrohuespedesFacade extends AbstractFacade<Registrohuespedes> implements RegistrohuespedesFacadeLocal {

    @PersistenceContext(unitName = "WebResHotel_IN5BM_2018024PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistrohuespedesFacade() {
        super(Registrohuespedes.class);
    }
    
}
