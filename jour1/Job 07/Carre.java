/*
    Carré.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 06/09/2023
*/

public class Carre extends Forme {
    private double cote;

    public Carre(double cote) {
        if (cote <= 0) {
            throw new IllegalArgumentException("Le côté doit être positif.");
        }
        this.cote = cote;
    }

    public double calculerAire() {
        return cote * cote;
    }
}