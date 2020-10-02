package com.example.g.salaproject.subject;

public class Cliente
{
    private String email;
    private String password;
    private String iva;

    public Cliente(String email, String password, String iva) {
        this.email = email;
        this.password = password;
        this.iva = iva;
    }

    //GET METHODS//
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getIva() {
        return iva;
    }


    //SET METHODS
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }
}
