/*
    DivisionExercice.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 07/09/2023
*/

public class DivisionExercice {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Erreur: Veuillez fournir exactement deux arguments.");
            System.exit(1);
        }

        try {
            int numerateur = Integer.parseInt(args[0]);
            int denominateur = Integer.parseInt(args[1]);

            int resultat = diviser(numerateur, denominateur);
            System.out.println("Résultat de la division : " + resultat);
        } catch (NumberFormatException e) {
            System.err.println("Erreur: Les deux arguments doivent être des nombres valides.");
        } catch (DivisionParZeroException e) {
            System.err.println("Erreur: " + e.getMessage());
        }
    }

    public static int diviser(int numerateur, int denominateur) throws DivisionParZeroException {
        if (denominateur == 0) {
            throw new DivisionParZeroException("DivsionParZeroException.");
        }
        return numerateur / denominateur;
    }
}