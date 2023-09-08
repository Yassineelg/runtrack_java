/*
    MotsUniquesExercice.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 08/09/2023
*/

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MotsUniquesExercice {
    public static void main(String[] args) {
        List<String> mots = Arrays.asList(args);

        Map<String, Long> occurrences = mots.stream()
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

        List<String> motsUniques = occurrences.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Mots uniques: " + String.join(", ", motsUniques));
    }
}