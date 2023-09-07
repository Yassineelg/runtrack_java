/*
    CompteEpargne.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 07/09/2023 10:45:34
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(double soldeInitial, double tauxInteret) {
        super(soldeInitial);
        if (tauxInteret < 0 || tauxInteret > 100) {
            throw new IllegalArgumentException("Le taux d'intérêt doit être compris entre 0 et 100.");
        }
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void ajouterInteret() {
        double interets = getSolde() * (tauxInteret / 100);
        deposer(interets);
        System.out.println("Intérêts ajoutés: " + interets + "€. Nouveau solde: " + getSolde() + "€");
    }

    @Override
    public void afficherSolde() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.##", symbols);
        String formattedTauxInteret = df.format(tauxInteret);

        System.out.println(
                "Solde du compte épargne: " + getSolde() + "€ avec un taux d'intérêt de " + formattedTauxInteret + "%");
    }
}