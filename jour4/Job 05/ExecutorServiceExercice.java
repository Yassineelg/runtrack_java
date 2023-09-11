/*
 * ExecutorServiceExercise.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 11/09/2023
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;

public class ExecutorServiceExercice {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Utilisation : java ExecutorServiceExercise <facteur>");
            return;
        }

        int facteur;
        try {
            facteur = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Le facteur doit être un nombre entier valide.");
            return;
        }

        ExecutorService executor = Executors.newFixedThreadPool(3);

        try {
            for (int i = 1; i <= 3; i++) {
                final int num = i;
                Future<Integer> future = executor.submit(() -> facteur * num);
                System.out.println("Résultat de la tâche " + num + ": " + future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Une erreur s'est produite lors de l'exécution d'une tâche : " + e.getMessage());
        } finally {
            executor.shutdown();
            try {
                if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                    System.err.println("Le pool de threads n'a pas été arrêté correctement.");
                }
            } catch (InterruptedException e) {
                System.err.println("L'attente de l'arrêt du pool de threads a été interrompue.");
            }
        }
    }
}