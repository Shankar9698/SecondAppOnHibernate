package org.example;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Emp_Details")
@Data
public class Employee {
    @Id
    int id;
    @Column(name = "First_name", nullable = false, length = 10)
    String fName;
    @Column(name = "Last_name", nullable = false, length = 10)
    String lName;
    @Temporal(TemporalType.TIMESTAMP)
    Date date;
    @Transient
    String token;
    boolean status;

}
