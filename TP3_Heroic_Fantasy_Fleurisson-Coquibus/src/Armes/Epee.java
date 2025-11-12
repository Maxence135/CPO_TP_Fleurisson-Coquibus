/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author maxen
 */
public class Epee extends Arme {
    int finesse;
    
    public Epee(int niveau_attaque, String nom, int finesse) {
        super(niveau_attaque, nom);
        if(finesse<0 || finesse>100){
            System.out.println("Erreur, la valeur de la finesse doit etre inferieur a 100");
        }
        this.finesse= finesse;
    }
    
}
