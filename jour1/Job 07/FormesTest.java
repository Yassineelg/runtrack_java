/*
    FormesTest.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 06/09/2023
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class FormesTest {
    public static void main(String[] args) {
        try {
            Cercle cercle = new Cercle(5);
            Carre carre = new Carre(4);

            DecimalFormat decimalFormat = creerDecimalFormat();

            String aireCercle = decimalFormat.format(cercle.calculerAire());
            String aireCarre = decimalFormat.format(carre.calculerAire());

            afficherAire("cercle", 5, aireCercle);
            afficherAire("carré", 4, aireCarre);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }

    private static DecimalFormat creerDecimalFormat() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        return new DecimalFormat("0.0#", symbols);
    }

    private static void afficherAire(String forme, double valeur, String aire) {
        System.out.println("Aire du " + forme + " de " + forme + " " + valeur + ": " + aire);
    }
}