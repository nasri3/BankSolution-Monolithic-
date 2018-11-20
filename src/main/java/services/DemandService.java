/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Demand;
import java.util.List;
import java.util.Optional;
import static jdk.nashorn.internal.objects.NativeMath.log;
import org.springframework.stereotype.Service;
import repositories.DemandRepository;

/**
 *
 * @author omar
 */
@Service
public class DemandService {
    private final DemandRepository demandRepository;

    public DemandService(DemandRepository demandRepository) {
        this.demandRepository = demandRepository;
    }
    
    
    public void delete(Long id) {
       // log.debug("Request to delete Customer : {}", id);

        Demand  demand = this.demandRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Cannot find Customer with id " + id));
        this.demandRepository.delete(demand);
    }
    
        public void create(Demand demand) {
       // log.debug("Request to create Customer : {}", customerDto);
        
                this.demandRepository.save(demand);
    
       }

        public List<Demand> findAll() {
       // log.debug("Request to get all Categories");
        return this.demandRepository.findAll();
               
    }
        
        public  Optional<Demand> findById(Long id){
            return this.demandRepository.findById(id);
        }
        
     
    
    
}
