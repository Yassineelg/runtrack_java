/*
 * HashMapArgumentExercice.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 12/09/2023
 */

import java.util.LinkedHashMap;

public class HashMapArgumentExercice {
    public static void main(String[] args) {
        if (args.length % 2 != 0) {
            System.err.println("Le nombre d'arguments doit être pair (clé-valeur).");
            System.exit(1);
        }

        LinkedHashMap<String, String> keyValuePairs = new LinkedHashMap<>();

        for (int i = 0; i < args.length; i += 2) {
            String key = args[i];
            String value = args[i + 1];
            keyValuePairs.put(key, value);
        }

        for (String key : keyValuePairs.keySet()) {
            System.out.println(key + " : " + keyValuePairs.get(key));
        }
    }
}
