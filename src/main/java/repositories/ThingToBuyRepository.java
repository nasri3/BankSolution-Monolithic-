/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import entities.ThingToBuy;
/**
 *
 * @author omar
 */
public interface ThingToBuyRepository extends JpaRepository<ThingToBuy, Object> {
    
}
