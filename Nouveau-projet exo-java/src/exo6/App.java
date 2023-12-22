package exo6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercice 6 :
        // Écrivez un programme Java qui demande deux chiffres à un utilisateur,
        // pour afficher la somme (addition), multiplier, soustraire, diviser et le
        // reste.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer un nombre : ");
        float n = scanner.nextInt();

        System.out.print("Entrer un autre nombre : ");
        float m = scanner.nextInt();

        float somme = n + m;
        float produit = n * m;
        float soustraction = n - m;
        float division = n / m;

        System.out.println("La somme de " + n + " et " + m + " est : " + somme);
        System.out.println("Le produit de " + n + " et " + m + " est : " + produit);
        System.out.println("La soustraction de " + n + " et " + m + " est : " + soustraction);
        System.out.println("La division de " + n + " et " + m + " est : " + division);

        scanner.close();

    }
}
