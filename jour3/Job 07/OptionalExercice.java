/*
    OptionalExercice.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 09/09/2023
*/

import java.util.Optional;

public class OptionalExercice {
    public static void main(String[] args) {
        String chaine = args.length > 0 ? args[0] : null;
        String resultat = Optional.ofNullable(chaine)
                .map(s -> s.length())
                .map(i -> Integer.toString(i))
                .orElseGet(() -> "Chaîne non fournie");
        System.out.println(resultat);
    }
}