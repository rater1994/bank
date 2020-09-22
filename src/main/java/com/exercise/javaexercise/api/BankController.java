package com.exercise.javaexercise.api;

import com.exercise.javaexercise.entitys.Bank;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
public interface BankController {

    @GetMapping("/getallbanks")
    List<Bank> gettAllBanks();

    @GetMapping("/getbankbyid/{id}")
    Bank getBankById(@PathVariable Long id);

    @PostMapping("/addbank")
    Bank addNewBank(@RequestBody Bank bank);

    @DeleteMapping("/deletebank/{id}")
    Bank deleteBankById(@PathVariable Long id);
}
