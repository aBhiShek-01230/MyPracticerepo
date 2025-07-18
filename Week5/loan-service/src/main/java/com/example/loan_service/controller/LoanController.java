package main.java.com.example.loan_service.controller;

import com.example.loan.model.Loan;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @GetMapping("/{loanNo}")
    public Loan getLoan(@PathVariable String loanNo) {
        return new Loan(loanNo, "Home", 750000, "Abhishek");
    }
}
