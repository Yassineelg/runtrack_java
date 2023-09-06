/*
    BanqueTest.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 06/09/2023 13:30:26
*/

public class BanqueTest {
    public static void main(String[] args) {
        try {
            CompteBancaire compte = new CompteBancaire(100);
            compte.afficherSolde();
            compte.deposer(50);
            compte.retirer(70);
            compte.retirer(90);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}