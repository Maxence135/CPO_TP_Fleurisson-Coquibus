/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_fleurisson.coquibus;
/*
Nom du programme : Bieres
Auteur : Maxence Fleurisson-Coquibus
Role : Familiarisation avec l'environnement
Date : 03/11/2025
 */
public class TP2_Bieres_FleurissonCoquibus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0f, "Dubuisson");
        BouteilleBiere deuxBiere = new BouteilleBiere("Kamehameha", 15.0f, "Namek");
        BouteilleBiere troisBiere = new BouteilleBiere("Smeagel", 8.0f, "Mordor");
        BouteilleBiere quatreBiere = new BouteilleBiere("Eau", 80.0f, "Pacific");
        uneBiere.lireEtiquette();
        deuxBiere.lireEtiquette();
        troisBiere.lireEtiquette();
        quatreBiere.lireEtiquette();
        uneBiere.decapsuler();
        troisBiere.decapsuler();
    }
    
}
