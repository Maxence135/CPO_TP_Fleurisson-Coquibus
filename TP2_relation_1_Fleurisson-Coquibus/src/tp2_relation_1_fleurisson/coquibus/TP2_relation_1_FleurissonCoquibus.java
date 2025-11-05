/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_fleurisson.coquibus;
/*
Nom du programme : relation
Auteur : Maxence Fleurisson-Coquibus
Role : relation
Date : 05/11/2025
 */
public class TP2_relation_1_FleurissonCoquibus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles " + uneClio
                + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);
/*
        bob.listeVoitures[0] = uneClio;
        bob.listeVoitures[1] = une2008;
        bob.nbVoitures = 2;
        reno.listeVoitures[0] = uneMicra;
        reno.listeVoitures[1] = uneAutreClio;
        reno.nbVoitures = 2;
        uneClio.proprietaire = Bob;
*/

        bob.ajouterVoiture(uneAutreClio);
        bob.ajouterVoiture(uneClio);
        reno.ajouterVoiture(uneAutreClio);
        reno.ajouterVoiture(uneMicra);
        
        System.out.println("la premiere voiture de Bob est une "+ bob.listeVoitures[0]);
        System.out.println("la deuxieme voiture de Bob est une "+ bob.listeVoitures[1]);
        System.out.println("la premiere voiture de Reno est une "+ reno.listeVoitures[0]);
        System.out.println("la deuxieme voiture de Reno est une "+ reno.listeVoitures[1]);

    }

}
