
package com.TP;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Donner le nom");
        String nom = Sc.nextLine();
        System.out.println("Donner le prenom");
        String prenom = Sc.nextLine();
        Email email = new Email(nom, prenom);
        System.out.println("Donner une adresse alternative");
        String emailAlternatif = Sc.nextLine();
        MotDePasse mdp = new MotDePasse();
        Employeur employeur =new Employeur(email.GeneratedEmail(), mdp.Generateur(5), emailAlternatif);
        System.out.println("------------------------------------------------");
        System.out.println("Bienvenue chez Company\nVotre email est : " +  employeur.getEmail()+ "\nVotre mot de passe généré est : " + employeur.getMdp()+ "\nVotre adresse alternative est : " + employeur.getEmailAlternatif());
        System.out.println("------------------------------------------------");
        System.out.println("Donner votre nouveau mot de passe:");
        employeur.ChangerMotDePasse(Sc.nextLine());
        System.out.println("Donner votre nouvelle adresse alternative");
        employeur.ChangerEmailAlternatif(Sc.nextLine());
        System.out.println("------------------------------------------------");
        System.out.println("Aprés la modification\nVotre email est : " +  employeur.getEmail()+ "\nVotre mot de passe généré est : " + employeur.getMdp()+ "\nVotre adresse alternative est : " + employeur.getEmailAlternatif());
        System.out.println("------------------------------------------------");

    }
}


