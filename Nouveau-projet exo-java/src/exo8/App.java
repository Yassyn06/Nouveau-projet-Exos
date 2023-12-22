package exo8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercice 8 :
        // Écrire un programme en Java qui permet de saisir 10 entiers dans un tableau.
        // - compter combien y a-t-il d'éléments pairs et impairs.
        // - mettre les éléments pairs dans un tableau T1 et les éléments impaires dans
        // un tableau T2.
        // - Puis afficher T1 et T2

        Scanner scanner = new Scanner(System.in);

        int[] tableau = new int[10];

        System.out.println("Saisissez 10 entiers : ");

        for (int i = 0; i < 10; i++) {
            tableau[i] = scanner.nextInt();
        }
        int nombrePairs = 0;
        int nombreImpairs = 0;

        for (int nombre : tableau) {
            if (nombre % 2 == 0) {
                nombrePairs++;
            } else {
                nombreImpairs++;
            }
        }
        int[] tableauPairs = new int[nombrePairs];
        int[] tableauImpairs = new int[nombreImpairs];

        int indexPairs = 0;
        int indexImpairs = 0;

        for (int nombre : tableau) {
            if (nombre % 2 == 0) {
                tableauPairs[indexPairs++] = nombre;
            } else {
                tableauImpairs[indexImpairs++] = nombre;
            }
        }

        System.out.print(" Tableau des éléments pairs : ");

        for (int i = 0; i < tableauPairs.length; i++) {
            System.out.print(tableauPairs[i]);
        }
        System.out.print(" Tableau des éléments impairs : ");
        for (int i = 0; i < tableauImpairs.length; i++) {
            System.out.print(tableauImpairs[i]);
        }

        scanner.close();

    }
}
