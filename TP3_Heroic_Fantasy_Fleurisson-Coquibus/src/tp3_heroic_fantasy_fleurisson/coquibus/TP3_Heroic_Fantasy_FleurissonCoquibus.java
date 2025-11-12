/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_fleurisson.coquibus;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

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
        ArrayList<Arme> armes = new ArrayList<>();

        armes.add(new Epee(7, "Excalibure", 5));
        armes.add(new Epee(4, "Durandal", 7));

        armes.add(new Baton(4, "Chene", 5));
        armes.add(new Baton(5, "Charme", 6));

        ArrayList<Personnage> perso = new ArrayList<>();

        perso.add(new Magicien("Gandalf", 65, true));
        perso.add(new Magicien("Garcimore", 44, false));

        perso.add(new Guerrier("Conan", 78, false));
        perso.add(new Guerrier("Lannister", 45, true));

        System.out.println(" Inventaire global d'armes :");
        for (Arme a : armes) {
            System.out.println(a);
        }
        System.out.println(" Les personnages :");
        for (Personnage b : perso) {
            System.out.println(b);
        }

    }
}
