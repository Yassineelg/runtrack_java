/*
    SimpleThreadExercice.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 11/09/2023
*/

public class SimpleThreadExercice implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Salut du thread!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new SimpleThreadExercice());
        thread.start();
    }
}