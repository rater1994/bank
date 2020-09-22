package com.exercise.javaexercise.api;

import com.exercise.javaexercise.entitys.Account;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public interface AccountController {

    @GetMapping("/allaccounts")
    List<Account> getAllAcounts();

    @GetMapping("/getaccountbyid/{id}")
    Account getById(@PathVariable Long id);

    @PostMapping("/addaccount")
    Account addNewAccount(@RequestBody Account account);

    @DeleteMapping("/deleteaccount/{id}")
    Account deleteAccountById(@PathVariable Long id);

}
