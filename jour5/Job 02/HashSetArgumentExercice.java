/*
 * HashSetArgumentExercice.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 12/09/2023
 */

import java.util.LinkedHashSet;

public class HashSetArgumentExercice {
    public static void main(String[] args) {
        LinkedHashSet<String> arguments = new LinkedHashSet<>();

        for (String arg : args) {
            arguments.add(arg);
        }

        for (String arg : arguments) {
            System.out.println(arg);
        }
    }
}