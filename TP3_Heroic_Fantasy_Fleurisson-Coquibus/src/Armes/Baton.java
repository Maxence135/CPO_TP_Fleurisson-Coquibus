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
public class Baton extends Arme {
    int age;
    
    public Baton(int niveau_attaque, String nom, int age) {
        super(niveau_attaque, nom);
        if(age<0 || age>100){
            System.out.println("Erreur, la valeur de l'age doit etre inferieur a 100");
        }
        this.age=age;
    }

    public int getAge() {
        return age;
    }
    
    
}
