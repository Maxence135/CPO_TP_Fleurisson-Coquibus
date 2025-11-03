/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_fleurisson.coquibus;

/*
Nom du programme : Convertisseur
Auteur : Maxence Fleurisson-Coquibus
Role : Familiarisation avec l'environnement
Date : 03/11/2025
 */
import java.util.Scanner;

public class TP2_convertisseurObjet_FleurissonCoquibus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Convertisseur conv = new Convertisseur();

        System.out.println("=== Convertisseur de températures ===");
        System.out.println("1 : Celsius vers Kelvin");
        System.out.println("2 : Kelvin vers Celsius");
        System.out.println("3 : Fahrenheit vers Celsius");
        System.out.println("4 : Celsius vers Fahrenheit");
        System.out.println("5 : Kelvin vers Fahrenheit");
        System.out.println("6 : Fahrenheit vers Kelvin");
        System.out.print("Choisissez une conversion : ");
        int choix = sc.nextInt();

        System.out.print("Entrez la température à convertir : ");
        double temp = sc.nextDouble();

        double resultat = 0;

        switch (choix) {
            case 1:
                resultat = conv.CelciusVersKelvin(temp);
                System.out.println(temp + " °C = " + resultat + " K");
                break;
            case 2:
                resultat = conv.KelvinVersCelcius(temp);
                System.out.println(temp + " K = " + resultat + " °C");
                break;
            case 3:
                resultat = conv.FarenheitVersCelcius(temp);
                System.out.println(temp + " °F = " + resultat + " °C");
                break;
            case 4:
                resultat = conv.CelciusVersFarenheit(temp);
                System.out.println(temp + " °C = " + resultat + " °F");
                break;
            case 5:
                resultat = conv.KelvinVersFarenheit(temp);
                System.out.println(temp + " K = " + resultat + " °F");
                break;
            case 6:
                resultat = conv.FarenheitVersKelvin(temp);
                System.out.println(temp + " °F = " + resultat + " K");
                break;
            default:
                System.out.println("Choix invalide !");
        }

        System.out.println(conv);
    }
}


