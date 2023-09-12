/*
 * StreamCollectExercice.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 12/09/2023
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectExercice {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Utilisation : java StreamCollectExercice <seuil> <nombre1> <nombre2> ...");
            System.exit(1);
        }

        try {
            int seuil = Integer.parseInt(args[0]);
            List<Integer> nombres = Arrays.stream(args)
                    .skip(1)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            List<Integer> inferieursAuSeuil = nombres.stream()
                    .filter(nombre -> nombre < seuil)
                    .collect(Collectors.toList());

            if (inferieursAuSeuil.isEmpty()) {
                System.out.println("Aucun nombre n'est inférieur à " + seuil + ".");
            } else {
                System.out.print("Nombres inférieurs à " + seuil + ": ");
                String result = inferieursAuSeuil.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(", "));
                System.out.println(result);
            }
        } catch (NumberFormatException e) {
            System.err.println("Erreur : Les arguments doivent être des nombres entiers valides.");
            System.exit(1);
        }
    }
}