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
    public void genererCombinaison() {
        for (int i = 0; i < 4; i++) {
            combinaisonSecrete[i] = (int) (Math.random() * 10);
        }
    }

    //On test la combinaison
    public Resultat test(int[] essai) {
        tentatives++;
        int exact = 0;
        int trophaut = 0;
        int tropbas = 0;
        for (int i = 0; i < 4; i++) {
            if (essai[i] == combinaisonSecrete[i]) {
                exact++;
            } else if (essai[i] > combinaisonSecrete[i]) {
                trophaut++;
            } else {
                tropbas++;
            }

        }
        return new Resultat(exact,trophaut,tropbas);
    }
    
    //On regarde si le jouer a utiliser les tentatives
    public boolean isFini(){
        return tentatives>=maxTentatives;
    }
    
    public int getTentative(){
        return tentatives;
    }
    
    //Renitialisation du jeu
    public void reset(){
        tentatives =0;
        genererCombinaison();
    }
    
    
}
