package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Car;
import model.Customer;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-01T17:05:02")
@StaticMetamodel(CarOrder.class)
public class CarOrder_ { 

    public static volatile SingularAttribute<CarOrder, Integer> quantity;
    public static volatile SingularAttribute<CarOrder, Car> car;
    public static volatile SingularAttribute<CarOrder, Long> id;
    public static volatile SingularAttribute<CarOrder, Customer> customer;

}