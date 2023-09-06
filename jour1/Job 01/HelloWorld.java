/*
    HelloWorld.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 06/09/2023
*/

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = "";

        while (userName.trim().isEmpty()) {
            System.out.print("Veuillez saisir votre nom: ");
            userName = scanner.nextLine();

            if (userName.trim().isEmpty()) {
                System.out.println("Le nom ne peut pas être vide.");
            }
        }

        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}