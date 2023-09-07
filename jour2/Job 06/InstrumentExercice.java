/*
    InstrumentExercice.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 07/09/2023
*/

public class InstrumentExercice {
    public static void main(String[] args) {
        Instrument guitare = new Guitare();
        Instrument piano = new Piano();

        guitare.jouer();
        piano.jouer();
    }
}
