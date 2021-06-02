package com.example.financeDashboard.finance;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="finance")
public class Finance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="add_date", columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
    private Date addDate;
    @Column(name="amount") private Integer amount;
    @Column(name="category")private String category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
