/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.ejb.entities.ProductFv;

/**
 *
 * @author Gonts
 */
@Local
public interface ProductFvFacadeLocal {

    void create(ProductFv productFv);

    void edit(ProductFv productFv);

    void remove(ProductFv productFv);

    ProductFv find(Object id);

    List<ProductFv> findAll();

    List<ProductFv> findRange(int[] range);

    int count();
    
}
