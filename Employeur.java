package com.TP;

public class Employeur {
    String email;
    String mdp;
    String emailAlternatif;

    public Employeur(String email, String mdp, String emailAlternatif) {
        this.email = email;
        this.mdp = mdp;
        this.emailAlternatif = emailAlternatif;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return this.mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getEmailAlternatif() {
        return this.emailAlternatif;
    }

    public void setEmailAlternatif(String emailAlternatif) {
        this.emailAlternatif = emailAlternatif;
    }

    public void ChangerMotDePasse(String newmdp) {
        setMdp(newmdp);
    }
    public void ChangerEmailAlternatif(String newadresse){
        setEmailAlternatif(newadresse);
    }
}

