/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import entities.Demand;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.DemandRepository;
import services.DemandService;

/**
 *
 * @author nasri
 */
@RestController
@RequestMapping("/Demands")
public class DemandController {
    private final DemandService demandService;

    public DemandController(DemandService demandService) {
        this.demandService = demandService;
    }

   
    
    @GetMapping
   String GetDemands(){
        return "hhhhh";
        
    }
    
    
    @GetMapping("/{id}")
    public Optional<Demand> findById(@PathVariable Long id) {
        return this.demandService.findById(id);
    }

    @PostMapping
    public void create(Demand demand) {
         this.demandService.create(demand);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.demandService.delete(id);
    }
}
