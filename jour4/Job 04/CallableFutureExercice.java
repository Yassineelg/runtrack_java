/*
 * CallableFutureExercice.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 11/09/2023
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableFutureExercice {

    public static void main(String[] args) {
        if (args.length != 2) {
            printUsageAndExit();
        }

        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);

            Callable<Integer> multiplicationTask = () -> number1 * number2;

            FutureTask<Integer> futureTask = new FutureTask<>(multiplicationTask);

            Thread thread = new Thread(futureTask);
            thread.start();

            int result = futureTask.get();

            printResult(result);
        } catch (NumberFormatException e) {
            handleNumberFormatException();
        } catch (InterruptedException | ExecutionException e) {
            handleExecutionException(e);
        }
    }

    private static void printUsageAndExit() {
        System.err.println("Utilisation : java CallableFutureExercise <nombre1> <nombre2>");
        System.exit(1);
    }

    private static void printResult(int result) {
        System.out.println("Résultat de la multiplication : " + result);
    }

    private static void handleNumberFormatException() {
        System.err.println("Les arguments doivent être des nombres entiers valides.");
    }

    private static void handleExecutionException(Exception e) {
        System.err.println("Une erreur s'est produite lors de l'exécution de la tâche : " + e.getMessage());
    }
}