/*
    StreamChainesExercice.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 09/09/2023
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamChainesExercice {
    private static final String MESSAGE_ERREUR_ARGUMENTS_INVALIDES = "Erreur : un ou plusieurs arguments ne sont pas valides.";

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Utilisation : java StreamChainesExercice <liste de mots>");
            return;
        }

        try {
            List<String> mots = Arrays.asList(args).stream()
                    .filter(m -> m != null && m.startsWith("a"))
                    .filter(m -> m.length() == 3)
                    .collect(Collectors.toList());

            String message = mots.isEmpty() ? "Aucun mot dans la liste ne satisfait les conditions."
                    : "Mots filtrés: " + String.join(", ", mots);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.err.println(MESSAGE_ERREUR_ARGUMENTS_INVALIDES);
        }
    }
}