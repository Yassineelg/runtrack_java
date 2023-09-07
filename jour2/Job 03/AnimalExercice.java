/*
    AnimalExercice.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 07/09/2023
*/

public class AnimalExercice {
    public static void main(String[] args) {
        Animal chat = new Chat();
        Animal chien = new Chien();
        Animal oiseau = new Oiseau();

        chat.faireDuBruit();
        chien.faireDuBruit();
        oiseau.faireDuBruit();
    }
}