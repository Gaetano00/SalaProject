package com.example.g.salaproject.subject.company;

import com.example.g.salaproject.subject.Cliente;

public class Company extends Cliente {

    private String companyName;

    //SUPERCLASS CONSTRUCTOR
    public Company(String email, String password, String iva) {
        super(email, password, iva);
    }

    //CLASS CONSTRUCTOR
    public Company(String email, String password, String iva, String companyName) {
        super(email, password, iva);
        this.companyName = companyName;
    }

    //GET METHODS
    public String getCompanyName() {
        return companyName;
    }

    //SET METHODS
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
