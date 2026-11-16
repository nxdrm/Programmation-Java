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
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Déclaration des vairables
        int operateur;
        float operande1;
        float operande2;
        float resultat = 0;
        
        System.out.println("Please enter the operator:"
                + "\n1) add"
                + "\n2) substract"
                + "\n3) mutiply"
                + "\n4) divide"
                + "\n5) modulo");
        
        Scanner sc = new Scanner(System.in);
        operateur = sc.nextInt();
        System.out.println("Operateur :"+operateur);
        //Cas d'erreur de saisie
        if(operateur>5){
            System.out.println("Erreur saisie.");
            System.exit(0);
        }else if(operateur<1){
            System.out.println("Erreur saisie.");
            System.exit(0);
        }
        
        
        if(operateur>=1 || operateur<=5){
            System.out.println("Entrer votre premiere valeur :");
        sc = new Scanner(System.in);
        operande1 = sc.nextFloat(); 
        
        System.out.println("Entrer votre deuxieme valeur :");
        sc = new Scanner(System.in);
        operande2 = sc.nextFloat();
        
        switch (operateur) {
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:            
                resultat = operande1 / operande2;
                break;
            case 5:
                resultat = operande1 % operande2;
                break;
            default:
                break;
        }
        //affichage resultat
        System.out.println("Le résultat est: " + resultat);
        }
        
    }
}
