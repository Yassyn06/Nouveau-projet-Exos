package exo2; 

public class App {
    public static void main(String[] args) throws Exception {

    // Exercice 2 :
    // Écrire un programme en Java qui permet de calculer la somme S=1+2+3+...+ 10. Utilisant la boucle for.
    
    int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
    System.out.printf("la somme  S=1+2+3+...+ 10: %d%n", sum);


    
    }
}
