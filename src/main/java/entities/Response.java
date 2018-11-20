/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author nasri
 */
@Entity
public class Response {
    @Id
    private Long id;
    private boolean result;
    private Loan loan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isResult() {
        return result;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }
    
    
}
