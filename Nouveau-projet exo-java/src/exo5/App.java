package exo5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercice 5 :
        // Écrivez un programme Java qui demande son nom à l’utilisateur et qui affiche
        // «Bonjour» à l'écran et le nom sur une ligne distincte.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir votre nom : ");

        String nom = scanner.next();

        System.out.println("Bonjour ");
        System.out.println(nom);

        scanner.close();
    }
}
