/*
 * StreamFilterExercice.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 12/09/2023
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExercice {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Utilisation : java StreamFilterExercice <seuil> <nombre1> <nombre2> ...");
            System.exit(1);
        }

        try {
            int seuil = Integer.parseInt(args[0]);
            List<Integer> nombres = Arrays.stream(args)
                    .skip(1)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            List<Integer> superieursAuSeuil = nombres.stream()
                    .filter(nombre -> nombre > seuil)
                    .collect(Collectors.toList());

            if (superieursAuSeuil.isEmpty()) {
                System.out.println("Aucun nombre n'est supérieur à " + seuil + ".");
            } else {
                System.out.print("Nombres supérieurs à " + seuil + ": ");
                for (int i = 0; i < superieursAuSeuil.size(); i++) {
                    System.out.print(superieursAuSeuil.get(i));
                    if (i < superieursAuSeuil.size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.err.println("Erreur : Les arguments doivent être des nombres entiers valides.");
            System.exit(1);
        }
    }
}