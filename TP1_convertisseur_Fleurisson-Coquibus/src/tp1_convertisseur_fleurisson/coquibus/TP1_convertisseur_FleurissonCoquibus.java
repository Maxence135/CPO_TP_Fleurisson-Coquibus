/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_fleurisson.coquibus;

import java.util.Scanner;

/*
Nom du programme : convertisseur
Auteur : Maxence Fleurisson-Coquibus
Role : Familiarisation avec l'environnement
Date : 20/10/2025
*/
public class TP1_convertisseur_FleurissonCoquibus {

    /**
     * @param tCelcius
     * @return 
     */
    
    public static double CelciusVersKelvin (double tCelcius) { 
         double tKelvin = tCelcius + 273.15;
        return tKelvin;
    }
    
    public static double KelvinVersCelcius(double tKelvin) {
         double tCelcius = tKelvin - 273.15;
        return tCelcius;
    }
    
    public static double FarenheitVersCelcius(double tFarenheit) {
         double tCelcius = (tFarenheit - 32) * 5 / 9;
        return tCelcius;
    }
    
    public static double CelciusVersFarenheit(double tCelcius) {
         double tFarenheit = (tCelcius * 9 / 5) + 32 ;
        return tFarenheit;
    }
    
    public static double KelvinVersFarenheit(double tKelvin) {
         double tFarenheit = (tKelvin - 273.15) * 9 / 5 + 32 ;
        return tFarenheit;
    }
    
    public static double FarenheitVersKelvin(double tFarenheit) {
         double tKelvin = (tFarenheit - 32) * 5 / 9 + 273.15 ;
        return tKelvin;
    }

    
    public static void main(String[] args) {
        /*
        System.out.println("Entrer une valeur reelle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le premier reel qui sera une temperature en C :");
        double reel = sc.nextDouble();
        
        double Kres;
        
        System.out.println("Voici la somme :");
        Kres = reel + 273.5 ;
                System.out.println("Temperature en K = " + Kres);
        */        
        
       
        
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Celsius vers Kelvin");
        System.out.println("2) Kelvin vers Celsius");
        System.out.println("3) Fahrenheit vers Celsius");
        System.out.println("4) Celsius vers Fahrenheit");
        System.out.println("5) Kelvin vers Fahrenheit");
        System.out.println("6) Fahrenheit vers Kelvin");
        
        System.out.print("Choisissez votre methode : ");
        int choix = sc.nextInt();

        System.out.print("Entrez la temperature a convertir : ");
        double valeur = sc.nextDouble();

        double resultat;

        switch (choix) {
            case 1:
                resultat = CelciusVersKelvin(valeur);
                System.out.println(valeur + " C = " + resultat + " K");
                break;
            case 2:
                resultat = KelvinVersCelcius(valeur);
                System.out.println(valeur + " K = " + resultat + " C");
                break;
            case 3:
                resultat = FarenheitVersCelcius(valeur);
                System.out.println(valeur + " F = " + resultat + " C");
                break;
            case 4:
                resultat = CelciusVersFarenheit(valeur);
                System.out.println(valeur + " C = " + resultat + " F");
                break;
            case 5:
                resultat = KelvinVersFarenheit(valeur);
                System.out.println(valeur + " K = " + resultat + " F");
                break;
            case 6:
                resultat = FarenheitVersKelvin(valeur);
                System.out.println(valeur + " F = " + resultat + " K");
                break;
            default:
                System.out.println("Erreur : choix invalide !");
        
} 
    }
    
}
