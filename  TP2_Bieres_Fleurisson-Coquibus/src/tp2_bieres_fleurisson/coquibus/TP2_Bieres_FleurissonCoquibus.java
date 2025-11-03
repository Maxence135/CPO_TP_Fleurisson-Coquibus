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
        uneBiere.lireEtiquette();
        uneBiere.decapsuler();
    }
    
}
