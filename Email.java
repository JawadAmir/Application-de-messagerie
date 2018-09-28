package com.TP;

public class Email {
    String nom;
    String prenom;

    public Email(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String GeneratedEmail() {
        return  this.nom + "." + this.prenom + "@company.com";
    }
}

