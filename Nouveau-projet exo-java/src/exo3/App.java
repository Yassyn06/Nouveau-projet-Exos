package exo3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    // Exercice 3 :
    // Écrire  un programme en Java  qui  permet d'échanger le contenu de deux entiers  A et B  saisis par l'utilisateur 
    // et afficher ces entiers  après l’échange.

    Scanner scanner = new Scanner (System.in);
    
    System.out.print("Entrer un entier a:");
    int a = scanner.nextInt();
    
    System.out.print("Entrer un entier b:");
    int b = scanner.nextInt();
    
    int c = a ;  a = b ;       
    b = c ;
    
    System.out.println("le contenu de a est: "+ a);
    
    System.out.print("le contenu de b est: "+ b);

    scanner.close();

    }
}

