/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BankSolution.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.BankSolution.entities.ThingToBuy;
import org.springframework.stereotype.Repository;
/**
 *
 * @author omar
 */
@Repository
public interface ThingToBuyRepository extends JpaRepository<ThingToBuy, Object> {
    
}
