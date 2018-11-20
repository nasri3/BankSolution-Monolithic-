/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BankSolution.entities;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author omar
 */
@Entity
public class Client {
    @Id
    @GeneratedValue
    Long id ;
    String FirstName ;
    String LastName;
    LocalDateTime dateOfBirth ;
    int age ;
    String job ;
    double averageOfGainPerMonth ;
    String email ;
    long cin ;
    long phoneNumber ;

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Client(Long id, String name, LocalDateTime dateOfBirth, int age, String job, double averageOfGainPerMonth, String email, long cin, long phoneNumber) {
        this.id = id;
      
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.job = job;
        this.averageOfGainPerMonth = averageOfGainPerMonth;
        this.email = email;
        this.cin = cin;
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

    public Client(Long id, String FirstName, String LastName, LocalDateTime dateOfBirth, int age, String job, double averageOfGainPerMonth, String email, long cin, long phoneNumber) {
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.job = job;
        this.averageOfGainPerMonth = averageOfGainPerMonth;
        this.email = email;
        this.cin = cin;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public long getCin() {
        return cin;
    }
    


    public Client() {
        // Ceci est un code :* 
        
    }

    public Long getId() {
        return id;
    }



    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public double getAverageOfGainPerMonth() {
        return averageOfGainPerMonth;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAverageOfGainPerMonth(double averageOfGainPerMonth) {
        this.averageOfGainPerMonth = averageOfGainPerMonth;
    }

 

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getLastName() {
        return LastName;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
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
        final Client other = (Client) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
