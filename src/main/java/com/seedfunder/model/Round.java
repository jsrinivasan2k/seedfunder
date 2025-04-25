package com.seedfunder.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Round {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Company company;

    @ManyToMany
    private List<Investor> investors;

    private Double targetAmount;
    private Double raisedAmount;

    @Enumerated(EnumType.STRING)
    private RoundStatus status;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Investor> getInvestors() {
        return investors;
    }

    public void setInvestors(List<Investor> investors) {
        this.investors = investors;
    }

    public Double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(Double targetAmount) {
        this.targetAmount = targetAmount;
    }

    public Double getRaisedAmount() {
        return raisedAmount;
    }

    public void setRaisedAmount(Double raisedAmount) {
        this.raisedAmount = raisedAmount;
    }

    public RoundStatus getStatus() {
        return status;
    }

    public void setStatus(RoundStatus status) {
        this.status = status;
    }
}