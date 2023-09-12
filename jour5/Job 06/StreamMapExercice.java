/*
 * StreamMapExercice.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 12/09/2023
 */

/*
 * StreamMapExercice.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 12/09/2023
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExercice {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Utilisation : java StreamMapExercice <nom1> <nom2> ...");
            System.exit(1);
        }

        try {
            List<String> noms = Arrays.asList(args);

            List<String> nomsEnMajuscules = noms.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());

            System.out.println(String.join(", ", nomsEnMajuscules));
        } catch (Exception e) {
            System.err.println("Erreur : Une erreur s'est produite lors de l'exécution du programme.");
            e.printStackTrace();
        }
    }
}