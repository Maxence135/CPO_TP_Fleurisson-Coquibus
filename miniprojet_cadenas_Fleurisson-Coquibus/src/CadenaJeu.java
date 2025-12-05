/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maxen
 */
public class CadenaJeu {
    private int[] combinaisonSecrete = new int[4];
    private int tentatives = 0;
    private int maxTentatives = 5;
    public CadenaJeu(){
        genererCombinaison();
    }
    
    //La methode creation de la combinaison
    public void genererCombinaison(){
        for(int i=0; i<4; i++){
            combinaisonSecrete[i]=(int)(Math.random()*10);
        }
    }
    
}
