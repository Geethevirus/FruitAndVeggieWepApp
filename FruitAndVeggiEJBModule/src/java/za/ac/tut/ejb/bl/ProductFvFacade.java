/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ejb.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.ejb.entities.ProductFv;

/**
 *
 * @author Gonts
 */
@Stateless
public class ProductFvFacade extends AbstractFacade<ProductFv> implements ProductFvFacadeLocal {

    @PersistenceContext(unitName = "FruitAndVeggiEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductFvFacade() {
        super(ProductFv.class);
    }
    
}
