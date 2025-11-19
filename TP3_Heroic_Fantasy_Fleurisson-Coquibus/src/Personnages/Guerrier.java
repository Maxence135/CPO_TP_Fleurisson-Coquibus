/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Epee;
import Personnages.Personnage;

/**
 *
 * @author maxen
 */
public class Guerrier extends Personnage {
    private boolean cheval;

    public Guerrier(String nom, int niveauVie, boolean cheval) {
        super(nom, niveauVie);
        this.cheval = cheval;
        nbGuerrier++;
    }
    
    protected boolean isArmedePredilection(Arme a){
        return a instanceof Epee;
    }

    @Override
    public String toString() {
        return super.toString() + ", cheval=" + cheval;
    }
 
    @Override
    public void finalize()throws Throwable{
        try{
            nbGuerrier--;
        } finally{
            super.finalize();
        }
    }
    
    @Override
    protected int calculerDegats(){
        return 30;
    }

    public boolean isCheval() {
        return cheval;
    }
    

}

