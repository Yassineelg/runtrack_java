/*
 * ThreadInterruptionExercice.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 11/09/2023
 */

public class ThreadInterruptionExercice {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Utilisation : java ThreadInterruptionExercice <nombre de secondes>");
            System.exit(1);
        }

        int sleepTime = Integer.parseInt(args[0]);

        // long startTime = System.currentTimeMillis();

        SleepingThread sleepingThread = new SleepingThread(sleepTime);
        sleepingThread.start();

        try {
            Thread.sleep(sleepTime / 2 * 1000);
            sleepingThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // long endTime = System.currentTimeMillis();

        // System.out.println("Temps d'exécution: " + (endTime - startTime) + "
        // millisecondes.");
    }
}