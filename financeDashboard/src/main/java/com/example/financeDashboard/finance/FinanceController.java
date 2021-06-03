package com.example.financeDashboard.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class FinanceController {
    @Autowired
    private FinanceRepository financeRepository;

    // Get Mappings
    @GetMapping("/finances")
    public Iterable<Finance> getFinances(){
        return financeRepository.findAll();
    }

    @GetMapping("/financeByMonth")
    public List<Finance> getFinancesByMonth(@RequestParam Integer month){
        Iterable<Finance> allFinance = financeRepository.findAll();
        ArrayList<Finance> financeByMonth = new ArrayList<>();
        for (Finance f: allFinance){
            Date d = f.getAddDate();
            Calendar cal = Calendar.getInstance();
            cal.setTime(d);
//            System.out.println(cal.get(Calendar.YEAR));
            if(cal.get(Calendar.MONTH) == month-1)
                financeByMonth.add(f);
        }
        return financeByMonth;
    }

    @GetMapping("/financeByYear")
    public List<Finance> getFinancesByYear(@RequestParam Integer year){
        Iterable<Finance> allFinance = financeRepository.findAll();
        ArrayList<Finance> financeByYear = new ArrayList<>();
        for (Finance f: allFinance){
            Date d = f.getAddDate();
            Calendar cal = Calendar.getInstance();
            cal.setTime(d);
//            System.out.println(cal.get(Calendar.YEAR));
            if(cal.get(Calendar.YEAR) == year)
                financeByYear.add(f);
        }
        return financeByYear;
    }

    // Post Mappings
    @PostMapping("/addFinance")
    public @ResponseBody String addFinance(@RequestParam String date, @RequestParam Integer amount, @RequestParam String category) throws ParseException {

        Finance newFinance = new Finance();

        Date newDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);

        newFinance.setAddDate(newDate);
        newFinance.setAmount(amount);
        newFinance.setCategory(category);

        financeRepository.save(newFinance);
        return "Finance Added on " + date;
    }

    // Delete Mappings
    @DeleteMapping("deleteFinance")
    public @ResponseBody String deleteFinance(@RequestParam Integer id){
        financeRepository.deleteById(id);
        return "Finance id'ed by " + Integer.toString(id) + " deleted!";
    }

}
