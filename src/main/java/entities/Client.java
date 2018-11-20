/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
    String name ;
    LocalDateTime dateOfBirth ;
    int age ;
    String job ;
    double averageOfGainPerMonth ;

    public Client(Long id, String name, LocalDateTime dateOfBirth, int age, String job, double averageOfGainPerMonth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.job = job;
        this.averageOfGainPerMonth = averageOfGainPerMonth;
    }

    public Client() {
        // Ceci est un code :* 
        
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public void setName(String name) {
        this.name = name;
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
    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", job=" + job + ", averageOfGainPerMonth=" + averageOfGainPerMonth + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Client other = (Client) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
