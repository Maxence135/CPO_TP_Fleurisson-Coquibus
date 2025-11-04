/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_fleurisson.coquibus;

/*
Nom du programme : manip
Auteur : Maxence Fleurisson-Coquibus
Role : Familiarisation avec l'environnement
Date : 04/11/2025
 */
public class TP2_manip_FleurissonCoquibus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);

        Tartiflette assiette3 = assiette2;

        System.out.println("Nb de calories de assiette3 : " + assiette3.nbCalories);

        assiette2.nbCalories += 100;
        System.out.println("On rajoute 100 calories");

        System.out.println("Nb de calories de assiette2 : " + assiette2.nbCalories);
        System.out.println("Nb de calories de assiette3 : " + assiette3.nbCalories);

        Moussaka[] tab = new Moussaka[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Moussaka(100 + i * 10);
        }
        int i = 0;
        for (Moussaka m : tab) {
            System.out.println("Moussaka " + i + " : " + m.nbCalories + " calories");
            i++;
        }

    }

}
