/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.ejb.entities.Customer_orders;

/**
 *
 * @author Gonts
 */
@Local
public interface Customer_ordersFacadeLocal {

    void create(Customer_orders customer_orders);

    void edit(Customer_orders customer_orders);

    void remove(Customer_orders customer_orders);

    Customer_orders find(Object id);

    List<Customer_orders> findAll();

    List<Customer_orders> findRange(int[] range);

    int count();
    
}
