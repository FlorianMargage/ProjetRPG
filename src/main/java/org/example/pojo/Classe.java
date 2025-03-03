package org.example.pojo;

import java.util.ArrayList;

public class Classe {
    private String nom;
    private Integer pointsDeVie;
    private Integer pointsDeMana;
    private Integer force;
    private Integer intelligence;
    private Integer defense;
    private Integer resistanceMagique;
    private Integer agilite;
    private Integer chance;
    private Integer endurance;
    private Integer esprit;

    public Classe() {
        this.nom = "Classe";
        this.pointsDeVie = 0;
        this.pointsDeMana = 0;
        this.force = 0;
        this.intelligence = 0;
        this.defense = 0;
        this.resistanceMagique = 0;
        this.agilite = 0;
        this.chance = 0;
        this.endurance = 0;
        this.esprit = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(Integer pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public Integer getPointsDeMana() {
        return pointsDeMana;
    }

    public void setPointsDeMana(Integer pointsDeMana) {
        this.pointsDeMana = pointsDeMana;
    }

    public Integer getForce() {
        return force;
    }

    public void setForce(Integer force) {
        this.force = force;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getResistanceMagique() {
        return resistanceMagique;
    }

    public void setResistanceMagique(Integer resistanceMagique) {
        this.resistanceMagique = resistanceMagique;
    }

    public Integer getAgilite() {
        return agilite;
    }

    public void setAgilite(Integer agilite) {
        this.agilite = agilite;
    }

    public Integer getChance() {
        return chance;
    }

    public void setChance(Integer chance) {
        this.chance = chance;
    }

    public Integer getEndurance() {
        return endurance;
    }

    public void setEndurance(Integer endurance) {
        this.endurance = endurance;
    }

    public Integer getEsprit() {
        return esprit;
    }

    public void setEsprit(Integer esprit) {
        this.esprit = esprit;
    }
}