/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author maxen
 */
public abstract class Arme {

    String nom;
    int niveau_attaque;

    public Arme(int niveau_attaque, String nom) {
        if (niveau_attaque < 0 || niveau_attaque > 100) {
            System.out.println("Erreur, la valeur de l'attaque doit etre comprise entre 0 et 100");
        }
        this.niveau_attaque = niveau_attaque;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauAttaque() {
        return niveau_attaque;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveau d'attaque=" + niveau_attaque + '}';
    }

}
