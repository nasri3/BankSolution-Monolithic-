/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.BankSolution.repositories;
import com.example.BankSolution.entities.Demand;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author omar
 */
@Repository
public interface DemandRepository extends JpaRepository<Demand, Long>{
   // public List<Demand> findAll();
    
}
