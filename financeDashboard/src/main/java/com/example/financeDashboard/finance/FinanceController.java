package com.example.financeDashboard.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class FinanceController {
    @Autowired
    private FinanceRepository financeRepository;

    @GetMapping("/finances")
    public Iterable<Finance> getFinances(){
        return financeRepository.findAll();
    }

    @PostMapping("/addFinance")
    public @ResponseBody String addFinance(@RequestParam Date date, @RequestParam Integer amount, @RequestParam String category){

        Finance newFinance = new Finance();
        newFinance.setAddDate(date);
        newFinance.setAmount(amount);
        newFinance.setCategory(category);

        financeRepository.save(newFinance);
        return "Finance Added!";
    }
}
