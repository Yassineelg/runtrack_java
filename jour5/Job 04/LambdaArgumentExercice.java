/*
 * LambdaArgumentExercice.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 12/09/2023
 */

import java.util.function.Predicate;

public class LambdaArgumentExercice {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Utilisation : java LambdaArgumentExercice <chaîne> <longueur minimale>");
            System.exit(1);
        }

        String inputString = args[0];
        String minLengthArg = args[1];

        int minLength;
        try {
            minLength = Integer.parseInt(minLengthArg);
        } catch (NumberFormatException e) {
            System.err.println("Erreur : La longueur minimale doit être un nombre entier valide.");
            System.exit(1);
            return;
        }

        Predicate<String> isLonger = str -> str.length() > minLength;

        if (isLonger.test(inputString)) {
            System.out.println("La chaîne " + inputString + " a une longueur supérieure à " + minLength + ".");
        } else {
            System.out.println("La chaîne " + inputString + " n'a pas une longueur supérieure à " + minLength + ".");
        }
    }
}