package org.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @Id
    int id;
    String first_name;
    String last_name;
    String address;
}
