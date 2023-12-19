package exo1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    // Exercice 1 :
    // Écrire un programme en Java qui demande l'âge d'un enfant et permet d'informer de sa catégorie sachant que les catégories sont les suivantes: 
    // "poussin de 6 a 7 ans"
    // "pupille de 8 a 9 ans "
    // "minime de 10 a 11 ans "
    // " cadet après 12 ans ".

    Scanner scanner = new Scanner(System.in);

    System.out.print("Entrez l'âge de l'enfant : ");

    int ageEnfant = scanner.nextInt();

    switch (ageEnfant) {
        case 6, 7:
            System.out.println("Votre catégorie est poussin");
            break;
        case 8, 9:
            System.out.println("Votre catégorie est pupille");
            break;
        case 10, 11:
            System.out.println("Votre catégorie est minime");
            break;
        default:
                System.out.println("Votre catégorie est cadet");
        }   
    scanner.close();
    
    }
}
