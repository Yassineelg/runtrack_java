/*
    VoitureExercice.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 07/09/2023
*/

public class VoitureExercice {
    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                System.out.println("Utilisation: java VoitureExercice <vitesse_demandee>");
                return;
            }

            Voiture voiture = new Voiture("Tesla", "rouge");
            voiture.demarrer();

            int vitesseDemandee = Integer.parseInt(args[0]);

            while (voiture.getVitesse() < vitesseDemandee) {
                voiture.accelerer();
            }

            voiture.freiner();
        } catch (VitesseLimiteDepasseeException e) {
            System.out.println("Erreur: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erreur: Veuillez fournir une vitesse valide en argument.");
        } catch (Exception e) {
            System.out.println("Erreur inattendue: " + e.getMessage());
        }
    }
}
