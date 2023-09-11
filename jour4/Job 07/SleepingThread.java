/*
 * SleepingThread.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 11/09/2023
 */

class SleepingThread extends Thread {
    private int sleepTime;

    public SleepingThread(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(sleepTime * 1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrompu après " + (sleepTime / 2) + " secondes!");
            return;
        }

        System.out.println("Le thread a terminé son sommeil.");
    }
}