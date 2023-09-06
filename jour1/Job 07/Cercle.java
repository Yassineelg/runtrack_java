/*
    Cercle.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 06/09/2023
*/

public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        if (rayon <= 0) {
            throw new IllegalArgumentException("Le rayon doit être positif.");
        }
        this.rayon = rayon;
    }

    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }
}