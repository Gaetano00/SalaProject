package com.example.g.salaproject.subject.private_;

import com.example.g.salaproject.subject.Cliente;

public class Private extends Cliente {

    private String Nome;
    private String Cognome;

    //SUPERCLASS CONSTRUCTOR
    public Private(String email, String password, String iva) {
        super(email, password, iva);
    }

    //CLASS CONSTRUCTOR
    public Private(String email, String password, String iva, String nome, String cognome) {
        super(email, password, iva);
        Nome = nome;
        Cognome = cognome;
    }

    //GET METHODS
    public String getNome() {
        return Nome;
    }

    public String getCognome() {
        return Cognome;
    }

    //SET METHODS
    public void setNome(String nome) {
        Nome = nome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }
}
