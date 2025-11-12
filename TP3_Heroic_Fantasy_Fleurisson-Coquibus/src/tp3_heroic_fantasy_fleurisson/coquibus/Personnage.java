/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_fleurisson.coquibus;

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
        } else {
            System.out.println(nom + " ne peut pas porter plus de 5 armes !");
        }
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
