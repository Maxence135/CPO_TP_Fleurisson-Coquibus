/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_fleurisson.coquibus;

/**
 *
 * @author maxen
 */
public class TP2_convertisseurObjet_FleurissonCoquibus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur conv1 = new Convertisseur();

        double tempC = 25;
        double tempK = conv1.CelciusVersKelvin(tempC);
        System.out.println(tempC + "°C = " + tempK + " K");

        double tempF = conv1.CelciusVersFarenheit(tempC);
        System.out.println(tempC + "°C = " + tempF + " °F");

        System.out.println(conv1); // affiche le nombre de conversions
    }
}
