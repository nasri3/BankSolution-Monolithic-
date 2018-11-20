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
import javax.persistence.OneToOne;

/**
 *
 * @author omar
 */

@Entity
public class Demand {
    @Id
    @GeneratedValue
    Long id ;
    
    double sumToLoan ;
    
    @OneToOne()
    Client client ;
    @OneToOne()
    ThingToBuy thing ;

    public Demand(Long id, double sumToLoan, Client client, ThingToBuy thing) {
        this.id = id;
        this.sumToLoan = sumToLoan;
        this.client = client;
        this.thing = thing;
    }

    public Demand() {
        //coooode nigga ..
    }

    @Override
    public String toString() {
        return "Demand{" + "id=" + id + ", sumToLoan=" + sumToLoan + ", client=" + client + ", thing=" + thing + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Demand other = (Demand) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public Long getId() {
        return id;
    }

    public double getSumToLoan() {
        return sumToLoan;
    }

    public Client getClient() {
        return client;
    }

    public ThingToBuy getThing() {
        return thing;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSumToLoan(double sumToLoan) {
        this.sumToLoan = sumToLoan;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setThing(ThingToBuy thing) {
        this.thing = thing;
    }
    
    
    
    
    
    
}
