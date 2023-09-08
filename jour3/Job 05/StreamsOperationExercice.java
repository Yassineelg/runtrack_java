/*
    StreamsOperationExercice.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 08/09/2023
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperationExercice {
    private static final String MESSAGE_ERREUR_ARGUMENTS_INVALIDES = "Erreur : un ou plusieurs arguments ne sont pas des nombres entiers valides.";
    private static final String MESSAGE_ERREUR_UTILISATION = "Utilisation : java StreamsOperationExercice <liste de nombres entiers>";

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println(MESSAGE_ERREUR_UTILISATION);
            return;
        }

        try {
            List<Integer> nombres = Arrays.asList(args).stream()
                    .map(Integer::parseInt)
                    .map(n -> n * 2)
                    .filter(n -> n > 10)
                    .collect(Collectors.toList());

            String message = nombres.isEmpty() ? "Aucun nombre dans la liste ne satisfait les conditions."
                    : nombres.toString();
            System.out.println(message);
        } catch (NumberFormatException e) {
            System.err.println(MESSAGE_ERREUR_ARGUMENTS_INVALIDES);
        }
    }
}