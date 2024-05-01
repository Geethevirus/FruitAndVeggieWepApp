package za.ac.tut.ejb.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-01T02:39:41")
@StaticMetamodel(ProductFv.class)
public class ProductFv_ { 

    public static volatile SingularAttribute<ProductFv, String> code;
    public static volatile SingularAttribute<ProductFv, Integer> quantity;
    public static volatile SingularAttribute<ProductFv, Double> price;
    public static volatile SingularAttribute<ProductFv, String> description;
    public static volatile SingularAttribute<ProductFv, Long> id;
    public static volatile SingularAttribute<ProductFv, Date> creation_date;
    public static volatile SingularAttribute<ProductFv, String> pic_url;

}