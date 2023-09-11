/*
 * RunnableInterfaceExercice.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 11/09/2023
 */

public class RunnableInterfaceExercice {

    public static void main(String[] args) {
        Thread thread = new Thread(RunnableInterfaceExercice::run);
        thread.start();
    }

    public static void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("En cours d'exécution...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
    }
}