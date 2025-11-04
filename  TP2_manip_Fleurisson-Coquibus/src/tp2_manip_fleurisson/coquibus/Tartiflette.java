/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_fleurisson.coquibus;

/**
 *
 * @author maxen
 */
public class Tartiflette {
    int nbCalories;

    @Override
    public String toString() {
        return "Tartiflette{" + "nbCalories=" + nbCalories + '}';
    }
    
    //Le Constructeur
    public Tartiflette(int NbCalories) {
        this.nbCalories = NbCalories;
    }
}
