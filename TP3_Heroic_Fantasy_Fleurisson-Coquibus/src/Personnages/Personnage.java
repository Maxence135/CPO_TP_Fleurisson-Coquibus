/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;
import tp3_heroic_fantasy_fleurisson.coquibus.EtreVivant;

/**
 *
 * @author maxen
 */
public abstract class Personnage implements EtreVivant {

    protected String nom;
    protected int niveauVie;
    protected ArrayList<Arme> inventaire = new ArrayList<>();
    protected Arme armeEnMain = null;
    protected abstract boolean isArmedePredilection(Arme a);
    protected static int nbPersonnage = 0;
    protected static int nbGuerrier = 0;
    protected static int nbMagicien = 0;
    protected abstract int calculerDegats();

    public static int getNbPersonnage() {
        return nbPersonnage;
    }

    public static int getNbGuerrier() {
        return nbGuerrier;
    }

    public static int getNbMagicien() {
        return nbMagicien;
    }

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        nbPersonnage++;
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
    
    public void attaquer(Personnage cible){
        if(!this.estVivant()){
            System.out.println("deja KO");
            return;
        }
        int degats = calculerDegats();
        cible.estAttaquer(degats);
        System.out.println(nom + " attaque " + cible.nom + " lui inflige " + degats + " degats ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{"
                + "nom='" + nom + '\''
                + ", niveauVie=" + niveauVie
                + ", nbArmes=" + inventaire.size()
                + '}';
    }
    
    @Override
    public void finalize()throws Throwable{
        try{
            nbPersonnage--;
        } finally{
            super.finalize();
        }
    }
    
    @Override
    public void seFatiguer(){
        this.niveauVie-=10;
    }
    @Override
    public boolean estVivant(){
        return this.niveauVie>0;
    }
    @Override
    public void estAttaquer(int points){
        this.niveauVie-=Math.max(0,points);
    }
  
}
