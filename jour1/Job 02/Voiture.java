/*
    Voiture.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 06/09/2023
*/

import java.util.Objects;

public class Voiture {
    private final String marque;
    private final String couleur;
    private int vitesse;

    public Voiture(String marque, String couleur) {
        this.marque = Objects.requireNonNull(marque, "La marque ne peut pas être nulle.");
        this.couleur = Objects.requireNonNull(couleur, "La couleur ne peut pas être nulle.");
        this.vitesse = 0;
    }

    public String getMarque() {
        return marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void demarrer() {
        System.out.println("La voiture démarre.");
        this.vitesse = 0;
    }

    public void accelerer() {
        vitesse += 10;
        System.out.println("La vitesse est maintenant de " + vitesse + " km/h.");
    }

    public void freiner() {
        System.out.println("La voiture s'arrête. Vitesse réinitialisée à 0 km/h.");
        vitesse = 0;
    }
}