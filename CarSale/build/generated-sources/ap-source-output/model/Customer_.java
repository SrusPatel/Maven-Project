package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.CarOrder;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-01T17:05:02")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> emailAddress;
    public static volatile SingularAttribute<Customer, String> address;
    public static volatile SingularAttribute<Customer, String> phoneNumber;
    public static volatile SingularAttribute<Customer, String> name;
    public static volatile ListAttribute<Customer, CarOrder> carOrders;
    public static volatile SingularAttribute<Customer, Long> id;

}