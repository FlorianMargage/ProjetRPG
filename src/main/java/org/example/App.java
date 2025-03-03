package org.example;

import org.example.pojo.Joueur;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String choisirNom() {
        boolean nomvalide = false;
        String nom = null;

        while (!nomvalide) {
            System.out.println("Veuillez entrer un nom :");
            nom = new Scanner(System.in).nextLine();
            nomvalide = estNomValide(nom);
        }
        return nom;
    }

    public static boolean estNomValide(String nom) {
        if (nom.length() < 4) {
            System.out.println("Le nom est trop court (minimum 4 lettres)");
        } else if (nom.length() > 12) {
            System.out.println("Le nom est trop long (maximum 12 lettres)");
        } else if (nom.matches(".*[^a-zA-Z].*")) {
            System.out.println("Le nom ne doit contenir que des lettres");
        } else {
            return true;
        }
        return false;
    }

    public static String choisirClasse() {
        boolean classevalide = false;
        String classe = null;

        System.out.println("Veuillez choisir une classe parmi guerrier, mage et voleur :");
        while (!classevalide) {
            classe = new Scanner(System.in).nextLine();
            switch (classe.toLowerCase())
            {
                case "guerrier":
                    classevalide = true;
                    break;
                case "mage":
                    classevalide = true;
                    break;
                case "voleur":
                    classevalide = true;
                    break;
                default:
                    System.out.println("Classe invalide, veuillez choisir parmi guerrier, mage et voleur :");
            }
        }
        return classe;
    }

    public static void main( String[] args )
    {
        Joueur joueur = new Joueur(choisirNom(), choisirClasse());
        System.out.println(joueur.getClasse().getNom());
    }
}
