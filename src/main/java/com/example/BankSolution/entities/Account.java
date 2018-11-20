/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.BankSolution.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author omar
 */
@Entity
public class Account {
    @Id
    @GeneratedValue
    Long id ;
    
    String typeOfAccount ;
    
    double amount ;
    
    @OneToOne()
    Bank bank ;
    @OneToOne()
    Client client ; 

    public Account() {
        //voila bb ce constructeur n est pas vide.
    }

    public Account(Long id, String typeOfAccount, double amount, Bank bank, Client client) {
        this.id = id;
        this.typeOfAccount = typeOfAccount;
        this.amount = amount;
        this.bank = bank;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public double getAmount() {
        return amount;
    }

    public Bank getBank() {
        return bank;
    }

    public Client getClient() {
        return client;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", typeOfAccount=" + typeOfAccount + ", amount=" + amount + ", bank=" + bank + ", client=" + client + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    

    
    
    
            
    
}
