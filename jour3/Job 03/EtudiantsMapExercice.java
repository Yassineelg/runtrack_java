/*
    EtudiantsMapExercice.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 08/09/2023
*/

import java.util.Map;
import java.util.TreeMap;

public class EtudiantsMapExercice {
    public static void main(String[] args) {
        Map<Integer, String> etudiants = new TreeMap<>();

        etudiants.put(101, "Pierre");
        etudiants.put(103, "Jean");
        etudiants.put(102, "Marie");

        for (Map.Entry<Integer, String> entry : etudiants.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}