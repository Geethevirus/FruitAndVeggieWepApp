/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.ejb.entities.LineItems;

/**
 *
 * @author Gonts
 */
@Local
public interface LineItemsFacadeLocal {

    void create(LineItems lineItems);

    void edit(LineItems lineItems);

    void remove(LineItems lineItems);

    LineItems find(Object id);

    List<LineItems> findAll();

    List<LineItems> findRange(int[] range);

    int count();
    
}
