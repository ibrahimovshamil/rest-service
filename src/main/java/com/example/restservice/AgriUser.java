package com.example.restservice;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class AgriUser {

    @Id
    @GeneratedValue
    public int id;
    public String type;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "agriuser_id")
    public List<Account> accounts = new ArrayList<>();
    public int loan;
    public int transactionCreadit;
    public int transcactionDebit;

    public AgriUser(){};

    public AgriUser(String type, List accounts, int loan, int transactionCreadit, int transcactionDebit) {
        this.type = type;
        this.accounts = accounts;
        this.loan = loan;
        this.transactionCreadit = transactionCreadit;
        this.transcactionDebit = transcactionDebit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public int getLoan() {
        return loan;
    }

    public void setLoan(int loan) {
        this.loan = loan;
    }

    public int getTransactionCreadit() {
        return transactionCreadit;
    }

    public void setTransactionCreadit(int transactionCreadit) {
        this.transactionCreadit = transactionCreadit;
    }

    public int getTranscactionDebit() {
        return transcactionDebit;
    }

    public void setTranscactionDebit(int transcactionDebit) {
        this.transcactionDebit = transcactionDebit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AgriUser)) return false;
        AgriUser agriUser = (AgriUser) o;
        return
                getLoan() == agriUser.getLoan() &&
                Objects.equals(getType(), agriUser.getType()) &&
                Objects.equals(getAccounts(), agriUser.getAccounts()) &&
                Objects.equals(getTransactionCreadit(), agriUser.getTransactionCreadit()) &&
                Objects.equals(getTranscactionDebit(), agriUser.getTranscactionDebit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getAccounts(), getLoan(), getTransactionCreadit(), getTranscactionDebit());
    }
}
