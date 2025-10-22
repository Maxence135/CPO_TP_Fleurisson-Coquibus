/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_fleurisson.coquibus;

import java.util.Scanner;

/*
Nom du programme : manipNombreInt
Auteur : Maxence Fleurisson-Coquibus
Role : Familiarisation avec l'environnement
Date : 20/10/2025
*/
public class TP1_manipNombresInt_FleurissonCoquibus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Entrer deux entiers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le premier entier :");
        int entier1 = sc.nextInt();
        System.out.println("Entrer le deuxieme entier :");
        int entier2 = sc.nextInt();
        
        double resultat;
        
        System.out.println("Voici la somme :");
        resultat = entier1 + entier2 ;
                System.out.println("Resultat = " + resultat);
        
        System.out.println("Voici la difference :");        
        resultat = entier1 - entier2 ;
                System.out.println("Resultat = " + resultat);
         
        System.out.println("Voici le produit :");        
        resultat = entier1 * entier2 ;
                System.out.println("Resultat = " + resultat);
        
        System.out.println("Voici le quotient :");
        int Quotient = entier1 / entier2;
                System.out.println("Quotient =" + Quotient);
                
        System.out.println("Voici le reste :");
        int Reste = entier1 % entier2;
                System.out.println("Reste =" + Reste);
                
                
    }
    
}
