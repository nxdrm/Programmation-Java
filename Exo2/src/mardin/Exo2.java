/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mardin;
import java.util.Scanner;

/**
 *
 * @author Mardin
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Déclaration des variables
        int nb;
        int result;
        int ind;
        //nb=5;
        result=0;
        
        //Saisie de la variable nb
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); //On demande a sc de donner le prochain entier
        
        //Addition des nb premiers entiers
        ind=1;
        while(ind<=nb){
            result=result+ind;
            ind++;
        }
        
        //Affichage du résultat
        System.out.println("");
        System.out.println("La somme des "+ nb + " entiers est: "+result);
        
    }
    
}
