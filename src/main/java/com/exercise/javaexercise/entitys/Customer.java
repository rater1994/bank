package com.exercise.javaexercise.entitys;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCustomer;
    private String firstName;
    private String lastName;

    @OneToMany
    List<Account> accountList;


}
