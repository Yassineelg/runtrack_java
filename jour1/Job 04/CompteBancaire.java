/*
    CompteBancaire.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 06/09/2023
*/

public class CompteBancaire {
    private int solde;

    public CompteBancaire(int soldeInitial) {
        if (soldeInitial < 0) {
            throw new IllegalArgumentException("Le solde initial ne peut pas être négatif.");
        }
        this.solde = soldeInitial;
    }

    public void deposer(int montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant du dépôt ne peut pas être négatif.");
        }
        solde += montant;
        System.out.println(montant + "€ déposés. Nouveau solde: " + solde + "€");
    }

    public void retirer(int montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant du retrait ne peut pas être négatif.");
        }
        if (montant > solde) {
            System.out.println("Tentative de retrait de " + montant + "€... Solde insuffisant!");
        } else {
            solde -= montant;
            System.out.println(montant + "€ retirés. Nouveau solde: " + solde + "€");
        }
    }

    public void afficherSolde() {
        System.out.println("Solde actuel: " + solde + "€");
    }
}
