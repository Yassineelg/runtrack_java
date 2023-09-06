/*
    JeuDeDes.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 06/09/2023
*/

import java.util.Random;

public class JeuDeDes {
    public static void lancerDes() {
        Random random = new Random();

        int de1 = random.nextInt(6) + 1;
        int de2 = random.nextInt(6) + 1;
        int somme = de1 + de2;

        System.out.println("Dé 1: " + de1);
        System.out.println("Dé 2: " + de2);
        System.out.println("Somme: " + somme);
    }

    public static void main(String[] args) {
        lancerDes();
    }
}