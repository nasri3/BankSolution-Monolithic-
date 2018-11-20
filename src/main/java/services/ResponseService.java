/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Client;
import entities.Demand;
import entities.Loan;
import entities.Response;
import repositories.ResponseRepository;

/**
 *
 * @author nasri
 */
public class ResponseService {
    private  final ResponseRepository responseRepository;

    public ResponseService(ResponseRepository responseRepository) {
        this.responseRepository = responseRepository;
    }
    
    private boolean ValidateStatus(Client client ){
        // validate personal situation
        //professional situation (employee, fixed-term or permanent contract, independent, precarious job ...)
        //your relationship with your bank

       return (client.getAge()<65 && (client.getAverageOfGainPerMonth()!=0) );
                   
    }
    
    private boolean ValidateLoan(Demand demand){
        //maximum reimbursemen 
        //duration of your loan (the longer this duration is important and the lower the rates),

        return (demand.getClient().getAverageOfGainPerMonth()*75>demand.getSumToLoan());
        

        
    }
    
    public Response Validate(Demand demand){
      Response response=new Response();
       response.setResult( ValidateStatus(demand.getClient())&& ValidateLoan(demand));
       if(response.isResult()){
           Loan loan=new Loan(Long.MIN_VALUE,
                   demand.getSumToLoan(), (int) ((int)demand.getSumToLoan()*1.1/(demand.getClient().getAverageOfGainPerMonth()*0.30)), 
                   demand.getClient(). getAverageOfGainPerMonth()*0.30 ,
                   0.10 );
           response.setLoan(loan);
       }
      return response;
    }
    
    
}
