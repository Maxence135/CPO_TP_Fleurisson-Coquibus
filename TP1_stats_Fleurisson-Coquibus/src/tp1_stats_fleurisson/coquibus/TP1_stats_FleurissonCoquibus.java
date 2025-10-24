/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_fleurisson.coquibus;

import java.util.Random;
import java.util.Scanner;

/*
Nom du programme : stats
Auteur : Maxence Fleurisson-Coquibus
Role : Familiarisation avec l'environnement
Date : 24/10/2025
 */
public class TP1_stats_FleurissonCoquibus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        double pourcentage;

        int[] faces = new int[6];

        System.out.print("Entrez le nombre de lancers de des a effectuer : ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int tirage = generateurAleat.nextInt(6);
            faces[tirage]++;
        }

        for (int i = 0; i < faces.length; i++) { //ca veut dire que ca parcours tt les cases du tableau de 0 a 5
            pourcentage = (faces[i] * 100.0) / m;
            System.out.println("Face " + (i + 1) + " : " + pourcentage + "%");

        }

    }
}
