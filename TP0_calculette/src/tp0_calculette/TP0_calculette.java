/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/*
Nom du programme : helloWorld*
Auteur : Maxence Fleurisson-Coquibus
Role : Familiarisation avec l'environnement
Date : 20/10/2025
*/
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( " Please enter the operator: " );
        System.out.println( " 1) add " ) ;
        System.out.println( " 2) substract " ) ;
        System.out.println( " 3) multiply " ) ;
        System.out.println( " 4) divide " ) ;
        System.out.println( " 5) modulo " ) ;
        Scanner sc = new Scanner(System.in); 
System.out.println("Entrer un operateur entre 1 et 5 :");  
        int operateur = sc.nextInt(); 
        if (operateur < 1 || operateur > 5){
            System.out.println("Erreur : operateur invalide !");
        }
        else{
       
System.out.println("Please enter the 1e number:");  
        int operande1 = sc.nextInt();
         
System.out.println("Please enter the 2e number:");  
        int operande2 = sc.nextInt(); 
        
        //les calculs :
        double resultat ;
        
        switch (operateur){
            case 1 :
                resultat = operande1 + operande2 ;
                System.out.println("Resultat = " + resultat);
                break;
            
            case 2 :
                resultat = operande1 - operande2 ;
                System.out.println("Resultat = " + resultat);
                break;
            
            case 3 :
                resultat = operande1 * operande2 ;
                System.out.println("Resultat = " + resultat);
                break;
            
            case 4 :
                if (operande2 != 0) {
        resultat = operande1 / operande2;
        System.out.println("Resultat = " + resultat);
    } else {
        System.out.println("Erreur : division par zero");
    }
    break;
                
            case 5 :
                resultat = operande1 % operande2 ;
                System.out.println("Resultat = " + resultat);
                break;
        }
    }
        
    }
    
}

