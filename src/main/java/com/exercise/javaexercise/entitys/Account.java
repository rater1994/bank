package com.exercise.javaexercise.entitys;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.List;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAccount;
    private Double balance;
    private Long cardNumber;

    @OneToMany
    List<Customer> customer;


}
