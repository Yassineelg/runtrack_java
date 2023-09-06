/*
    VoitureTest.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 06/09/2023
*/

public class VoitureTest {
    public static void main(String[] args) {
        try {
            Voiture voiture = new Voiture("Tesla", "rouge");
            voiture.demarrer();
            voiture.accelerer();
            voiture.accelerer();
            voiture.freiner();
        } catch (NullPointerException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}