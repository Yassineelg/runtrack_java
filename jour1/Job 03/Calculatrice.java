/*
    Calculatrice.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 06/09/2023
*/

import java.util.Scanner;

public class Calculatrice {
    public static double addition(double nombre1, double nombre2) {
        return nombre1 + nombre2;
    }

    public static double soustraction(double nombre1, double nombre2) {
        return nombre1 - nombre2;
    }

    public static double multiplication(double nombre1, double nombre2) {
        return nombre1 * nombre2;
    }

    public static double division(double nombre1, double nombre2) {
        if (nombre2 == 0) {
            throw new IllegalArgumentException("Division par zéro n'est pas autorisée.");
        }
        return nombre1 / nombre2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre: ");
        double nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre: ");
        double nombre2 = scanner.nextDouble();

        double somme = addition(nombre1, nombre2);
        double difference = soustraction(nombre1, nombre2);
        double produit = multiplication(nombre1, nombre2);

        try {
            double division = division(nombre1, nombre2);

            System.out.println("Somme: " + somme);
            System.out.println("Différence: " + difference);
            System.out.println("Produit: " + produit);
            System.out.println("Division: " + division);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        scanner.close();
    }
}