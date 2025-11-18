/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;
import Personnages.Personnage;

/**
 *
 * @author maxen
 */
public class Magicien extends Personnage {
    private boolean confirme;

    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
    }
    
    protected boolean isArmedePredilection(Arme a){
        return a instanceof Baton;
    }

    @Override
    public String toString() {
        return super.toString() + ", confirme=" + confirme;
    }

}
