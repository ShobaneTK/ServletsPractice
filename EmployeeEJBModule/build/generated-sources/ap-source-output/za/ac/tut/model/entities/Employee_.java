package za.ac.tut.model.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-05-15T17:32:35")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Date> hireDate;
    public static volatile SingularAttribute<Employee, Character> gender;
    public static volatile SingularAttribute<Employee, String> name;
    public static volatile SingularAttribute<Employee, Long> id;
    public static volatile SingularAttribute<Employee, Integer> age;

}