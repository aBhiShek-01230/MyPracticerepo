package main.java.com.example.account_service.controller;


import com.example.account.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/{accNo}")
    public Account getAccount(@PathVariable String accNo) {
        return new Account(accNo, "Abhishek", "Savings", 50000);
    }
}
