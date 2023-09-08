/*
    ListeEntiersExercice.javaby: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 08/09/2023
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListeEntiersExercice {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Utilisation: java ListeEntiersExercice <liste de nombres entiers>");
            return;
        }

        try {
            List<Integer> entiers = Arrays.stream(args)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            int sommePairs = entiers.stream()
                    .filter(n -> n % 2 == 0)
                    .mapToInt(Integer::intValue)
                    .sum();

            System.out.println("Somme des nombres pairs: " + sommePairs);
        } catch (NumberFormatException e) {
            System.err.println("Erreur: un ou plusieurs arguments ne sont pas des entiers valides.");
        }
    }
}