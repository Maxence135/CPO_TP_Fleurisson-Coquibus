/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_fleurisson.coquibus;


/**
 *
 * @author maxen
 */

public class BouteilleBiere {
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;

    // le constructeur
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }


    // les méthodes
    public void lireEtiquette() { 
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + 
                           " degres)\nBrasserie : " + brasserie);
    } 
    
    public boolean decapsuler() {
    if (!ouverte) {
        ouverte = true;
        System.out.println("Tu as ouvert la biere " + nom);
        return true;
    } else {
        System.out.println("Erreur : bière déjà ouverte !");
        return false;
    }
    
    
    @Override
    public String toString(){
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés) ouverte ? ";
    if (ouverte == true) {
        chaine_a_retourner += "oui";
    } else {
        chaine_a_retourner += "non";
    }
    return chaine_a_retourner;
}

}

}
