/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_fleurisson.coquibus;

import Personnages.Guerrier;
import Personnages.Magicien;
import Armes.Epee;
import Armes.Baton;

/*
Nom du programme : Heroic Fantasy
Auteur : Maxence Fleurisson-Coquibus
Role : relation
Date : 12/11/2025
 */
public class TP3_Heroic_Fantasy_FleurissonCoquibus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Guerrier g = new Guerrier("Archeon", 50000, true);
        Magicien m = new Magicien("Mehdi", 120, false);

        Baton b1 = new Baton(4, "Chene", 5);
        Baton b2 = new Baton(5, "Charme", 6);

        Epee e1 = new Epee(7, "Excalibur", 5);
        Epee e2 = new Epee(4, "Durandal", 7);

        g.ajouterArme(e1);
        g.ajouterArme(b1);

        g.equiper("Excalibur");

        m.ajouterArme(e2);
        m.ajouterArme(b2);

        m.equiper("Charme");

        System.out.println("Arme de predilection du magicien " + m.compterArmesDePredilection());
        System.out.println("Arme de predilection du guerrier " + g.compterArmesDePredilection());

        System.out.println("Personnages :");
        System.out.println(g);
        System.out.println(m);

        System.out.println("\n--- DEBUT DU COMBAT ---");

        // Attaques
        m.attaquer(g);
        System.out.println(m);
        System.out.println(g);

        g.attaquer(m);
        System.out.println(m);
        System.out.println(g);

        // Vérifier vivants
        System.out.println("Mage vivant ? " + m.estVivant());
        System.out.println("Warrior vivant ? " + g.estVivant());

    }
}
