package org.example.pojo;

public class Joueur {
    private String nom;
    private Classe classe;

    public Joueur(String nom, String classe) {
        this.nom = nom;
        setClasse(classe);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private void setClasse(String classe) {
        switch (classe) {
            case "guerrier":
                this.classe = new Guerrier();
                break;
            case "mage":
                this.classe = new Mage();
                break;
            case "voleur":
                this.classe = new Voleur();
                break;
            default:
                this.classe = new Classe();
        }
    }

    public Classe getClasse() {
        return classe;
    }
}
