package com.exercise.javaexercise.repositorys;

import com.exercise.javaexercise.entitys.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
