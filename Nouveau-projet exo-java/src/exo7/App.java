package exo7;

import java.util.Scanner;

public class App {
public static void main(String[] args) throws Exception {

// Exercice 7 :
// Écrivez un programme Java qui accepte trois nombres et affiche:
// "Tous les nombres sont égaux" si les trois nombres sont égaux, 
// "Tous les nombres sont différents" si les trois nombres sont différents et 
// sinon "Ni tous ni égaux ni différents".

Scanner scanner = new Scanner (System.in);
    
System.out.print("Entrer un premier nombre:");
int n1 = scanner.nextInt();
    
System.out.print("Entrer un deuxième nombre:");
int n2 = scanner.nextInt();

System.out.print("Entrer un troixième nombre:");
int n3 = scanner.nextInt();

if(n1 == n2 && n2 == n3)
    {System.out.println("Tous les nombres sont égaux.");}

    else if (n1 != n2 && n2 != n3 && n1 != n3)
    {System.out.println("Tous les nombres sont différents.");}

    else {System.out.println("Ni tous ni égaux ni différents.");}

scanner.close();

    }
}
