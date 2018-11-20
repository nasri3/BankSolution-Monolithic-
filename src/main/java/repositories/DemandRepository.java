/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;
import entities.Demand;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author omar
 */
public interface DemandRepository extends JpaRepository<Demand, Long>{
    
}
