package exo4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercice 4 :
        // Une boutique propose à ses clients, une réduction de 15% pour les montants
        // d’achat supérieurs à 200 Euros.
        // Écrire un programme en Java permettant de saisir le prix total HT et de
        // calculer le montant TTC
        // en prenant en compte la réduction et la TVA=20%.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisir le prix total HT:");
        double Prix_Total_HT = scanner.nextFloat();

        double Prix_Total_TTC = Prix_Total_HT + Prix_Total_HT * 20 / 100;

        if (Prix_Total_TTC > 200) {
            Prix_Total_TTC = Prix_Total_TTC - Prix_Total_TTC * 15 / 100;

            System.out.print("le montant TTC est: " + Prix_Total_TTC);

        } else {
            System.out.print("le montant TTC est: " + Prix_Total_TTC);
        }
        scanner.close();
    }
}
