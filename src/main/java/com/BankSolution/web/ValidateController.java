/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BankSolution.web;

import com.BankSolution.entities.Demand;
import com.BankSolution.entities.Response;
import com.BankSolution.services.ResponseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nasri
 */
@RestController
@RequestMapping("/Validates")
public class ValidateController {
    private final ResponseService responseService;

    public ValidateController(ResponseService responseService) {
        this.responseService = responseService;
    }
    
    @GetMapping
    public Response Validate(Demand demand){
      return  this.responseService.Validate(demand);
        
    }
    
}
