package com.exercise.javaexercise.repositorys;

import com.exercise.javaexercise.entitys.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
}
