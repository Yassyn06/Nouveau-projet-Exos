package exo11;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercice 11 :
        // Écrivez un programme java qui renvoie le plus grand entier dans un tableau.
        // Exemple:
        // int[] tab = {1, 2, 9, 4};

        int plusGrand = 0;

        int[] tableau = { 1, 2, 9, 4 };

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > plusGrand) {
                plusGrand = tableau[i];
            }
        }
        System.out.println("Le plus grand entier dans le tableau est : " + plusGrand);

    }
}
