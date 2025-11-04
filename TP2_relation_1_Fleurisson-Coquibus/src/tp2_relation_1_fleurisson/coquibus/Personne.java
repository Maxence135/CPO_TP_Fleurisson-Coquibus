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

    public void ajouterVoiture(Voiture v) {
        if (nbVoitures < 3) {
            listeVoitures[nbVoitures] = v;
            nbVoitures++;
            v.proprietaire = this; // lien bidirectionnel
        } else {
            System.out.println(prenom + " " + nom + " possède déjà 3 voitures !");
        }
    }
}
