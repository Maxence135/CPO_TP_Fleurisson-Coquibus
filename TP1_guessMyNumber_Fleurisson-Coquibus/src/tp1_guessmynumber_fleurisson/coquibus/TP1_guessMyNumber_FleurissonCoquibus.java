/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_fleurisson.coquibus;

import java.util.Random;
import java.util.Scanner;

/*
Nom du programme : guessMyNumber
Auteur : Maxence Fleurisson-Coquibus
Role : Familiarisation avec l'environnement
Date : 20/10/2025
 */
public class TP1_guessMyNumber_FleurissonCoquibus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100) + 1;
        System.out.println(" Choisissez le niveau de difficulté : ");
        System.out.println(" 1) Facile ");
        System.out.println(" 2) Normal ");
        System.out.println(" 3) Difficile ");
        int essai = 0;
        int maxessai = 0;

        int niveau = sc.nextInt();

        switch (niveau) {
            case 1:
                maxessai = 15;
                System.out.println("Mode FACILE : 15 essais possibles, messages d’aide détaillés !");
                break;
            case 2:
                maxessai = 10;
                System.out.println("Mode NORMAL : 10 essais possibles.");
                break;
            case 3:
                maxessai = 5;
                System.out.println("Mode DIFFICILE : 5 essais seulement !");
                break;
        }

        System.out.println("Choisissez un nombre entre 1 et 100 :");
        int nombre = sc.nextInt();

        if (nombre == n) {
            System.out.println("gagne");
        } else {
            System.out.println("faux");
            while (nombre != n) {
                essai = essai + 1;
                if (essai == maxessai) {
                    System.out.println("perdu");
                    break;
                } else {
                    System.out.println("redonner un nombre entre 1 et 100 :");
                    nombre = sc.nextInt();
                    if (nombre < n) {
                        System.out.println("trop petit");
                    } else if (nombre > n) {
                        System.out.println("trop grand");

                    } else {
                        System.out.println("gagne");
                        System.out.println("nombre d'essai :" + essai);
                        break;
                    }
                }
            }
        }
    }
}
