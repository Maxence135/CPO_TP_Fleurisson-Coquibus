/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_fleurisson.coquibus;

/**
 *
 * @author maxen
 */
public class Personne {

    String nom;
    String prenom;
    Voiture[] listeVoitures;
    int nbVoitures;

    public Personne(String unNom, String unPrenom) {
        nom = unNom;
        prenom = unPrenom;
        listeVoitures = new Voiture[3];
        nbVoitures = 0;
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }

    public boolean ajouterVoiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("Cette voiture appartient deja a "
                    + voiture_a_ajouter.proprietaire.prenom + " "
                    + voiture_a_ajouter.proprietaire.nom + " !");
            return false;
        }

        if (nbVoitures >= 3) {
            System.out.println(prenom + " " + nom + " possede deja 3 voitures !");
            return false;
        }

        listeVoitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.proprietaire = this;
        return true;
    }

}
