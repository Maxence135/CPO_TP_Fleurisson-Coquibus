/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author maxen
 */
public abstract class Personnage {

    protected String nom;
    protected int niveauVie;
    protected ArrayList<Arme> inventaire = new ArrayList<>();
    protected Arme armeEnMain = null;
    protected abstract boolean isArmedePredilection(Arme a);

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public void ajouterArme(Arme a) {
        if (inventaire.size() < 5) {
            inventaire.add(a);
            System.out.println(nom + " ajouter l'arme " + a.getNom());
        } else {
            System.out.println(nom + " ne peut pas porter plus de 5 armes !");
        }
    }
    
    public Arme getArmeEnMain(){
       return armeEnMain; 
    }
    
    public boolean equiper(String nomArme){
        for(Arme a : inventaire){
            if(a.getNom().equalsIgnoreCase(nomArme)){
                armeEnMain = a;
                System.out.println(nom + " équipe " + nomArme);
                return true;
            }
        }
        System.out.println(nom + " n'a pas l'arme " + nomArme + " dans son inventaire ");
        return false;
    }
    
    public int compterArmesDePredilection(){
        int c = 0;
        for(Arme a : inventaire){
            if(isArmedePredilection(a)){
                c++;
            }
        }
        return c;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{"
                + "nom='" + nom + '\''
                + ", niveauVie=" + niveauVie
                + ", nbArmes=" + inventaire.size()
                + '}';
    }

    
    
    
}
