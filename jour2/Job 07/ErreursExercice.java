/*
    ErreursExercice.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 07/09/2023
*/

public class ErreursExercice {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            int den = Integer.parseInt(args[1]);

            System.out.print("Résultat de la division: ");

            int result = num / den;

            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Erreur: NullPointerException.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur: ArrayIndexOutOfBoundsException.");
        } catch (ArithmeticException e) {
            System.out.println("Erreur: ArithmeticException.");
        } catch (NumberFormatException e) {
            System.out.println("Erreur: NumberFormatException.");
        } catch (Exception e) {
            System.out.println("Erreur inattendue: " + e.getMessage());
        }
    }
}