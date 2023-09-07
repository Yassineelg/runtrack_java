/*
    CompteBancaire.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 06/09/2023
*/

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double soldeInitial) {
        if (soldeInitial < 0) {
            throw new IllegalArgumentException("Le solde initial ne peut pas être négatif.");
        }
        this.solde = soldeInitial;
    }

    public double getSolde() {
        return solde;
    }

    public void deposer(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant du dépôt ne peut pas être négatif.");
        }
        solde += montant;
    }

    public void retirer(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant du retrait ne peut pas être négatif.");
        }
        if (montant > solde) {
            throw new IllegalArgumentException("Solde insuffisant pour effectuer ce retrait.");
        }
        solde -= montant;
    }

    public void afficherSolde() {
        System.out.println("Solde actuel: " + solde + "€");
    }
}