package za.ac.tut.ejb.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.ejb.entities.Address;
import za.ac.tut.ejb.entities.LineItems;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-01T02:39:41")
@StaticMetamodel(Customer_orders.class)
public class Customer_orders_ { 

    public static volatile SingularAttribute<Customer_orders, Date> creation_time;
    public static volatile SingularAttribute<Customer_orders, Address> address;
    public static volatile ListAttribute<Customer_orders, LineItems> orderedItems;
    public static volatile SingularAttribute<Customer_orders, Double> amount_due;
    public static volatile SingularAttribute<Customer_orders, Long> id;

}