/*
    BanqueExercice.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 07/09/2023
*/

public class BanqueExercice {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Utilisation: java BanqueExercice <solde_cc> <solde_ce> <taux_interet_ce>");
            return;
        }

        double soldeCourant = Double.parseDouble(args[0]);
        double soldeEpargne = Double.parseDouble(args[1]);
        double tauxInteretEpargne = Double.parseDouble(args[2]);

        CompteCourant compteCourant = new CompteCourant(soldeCourant);
        CompteEpargne compteEpargne = new CompteEpargne(soldeEpargne, tauxInteretEpargne);

        System.out.println("Solde du compte courant: " + compteCourant.getSolde() + "€");
        compteEpargne.afficherSolde();
        compteEpargne.ajouterInteret();
    }
}