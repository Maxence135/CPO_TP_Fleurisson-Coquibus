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
        Guerrier g = new Guerrier("Conan",80,false);
        Magicien m = new Magicien("Gandalf",70,true);
        
        Baton b1 = new Baton(3,"Baton1",2);
        Baton b2 = new Baton(4,"Baton2",3);
        Baton b3 = new Baton(5,"Baton3",4);
        
        Epee e1 = new Epee(6,"Epee1",2);
        Epee e2 = new Epee(7,"Epee2",3);
        Epee e3 = new Epee(8,"Epee3",4);
        
        g.ajouterArme(e1);
        g.ajouterArme(e2);
        g.ajouterArme(e3);
        
        g.equiper("Epee1");
        
        m.ajouterArme(b1);
        m.ajouterArme(b2);
        m.ajouterArme(b3);
        
        m.equiper("Baton1");
        
        System.out.println("Arme de predilection du magicien " + m.compterArmesDePredilection());
        System.out.println("Arme de predilection du guerrier " + g.compterArmesDePredilection());
        
        System.out.println("Personnages :");
        System.out.println(g);
        System.out.println(m);
        
        g.seFatiguer();
        System.out.println(g + " | Vivant : " + g.estVivant());
        
        g.attaquer(m);
        System.out.println(m);
        System.out.println(g);
        
    }
}
