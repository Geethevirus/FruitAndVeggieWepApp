/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ejb.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.ejb.entities.Customer_orders;

/**
 *
 * @author Gonts
 */
@Stateless
public class Customer_ordersFacade extends AbstractFacade<Customer_orders> implements Customer_ordersFacadeLocal {

    @PersistenceContext(unitName = "FruitAndVeggiEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Customer_ordersFacade() {
        super(Customer_orders.class);
    }
    
}
