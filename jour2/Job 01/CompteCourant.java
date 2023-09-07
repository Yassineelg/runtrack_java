/*
    CompteCourant.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 07/09/2023
*/

public class CompteCourant extends CompteBancaire {
    public CompteCourant(double soldeInitial) {
        super(soldeInitial);
    }

    @Override
    public void deposer(double montant) {
        super.deposer(montant);
        System.out.println(montant + "€ déposés. Nouveau solde: " + getSolde() + "€");
    }

    @Override
    public void retirer(double montant) {
        super.retirer(montant);
        System.out.println(montant + "€ retirés. Nouveau solde: " + getSolde() + "€");
    }
}