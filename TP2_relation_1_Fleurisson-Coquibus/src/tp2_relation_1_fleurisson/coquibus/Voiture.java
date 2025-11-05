/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_fleurisson.coquibus;

/**
 *
 * @author maxen
 */
public class Voiture {
    String modele;
    String marque;
    int puissanceCV;
    Personne proprietaire;

    public Voiture(String unModele, String uneMarque, int unePuissance) {
        modele = unModele;
        marque = uneMarque;
        puissanceCV = unePuissance;
        proprietaire = null;
    }

    @Override
    public String toString() {
        String texte = modele + " (" + marque + ", " + puissanceCV + " CV)";
        if (proprietaire != null) {
            texte += " - proprietaire : " + proprietaire.prenom + " " + proprietaire.nom;
        }
        return texte;
    }
}
