/*
    GenericsExercice.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 08/09/2023
*/

public class GenericsExercice {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java GenericsExercice <type> <contenu>");
            System.exit(1);
        }

        String type = args[0];
        String contenu = args[1];

        try {
            if (type.equalsIgnoreCase("String")) {
                Boite<String> boiteString = createAndAddToBoite(contenu);
                System.out.println("Contenu de la boîte: " + boiteString.recuperer());
            } else {
                Number number = parseNumber(type, contenu);
                Boite<Number> boiteNumber = createAndAddToBoite(number);
                System.out.println("Contenu de la boîte: " + boiteNumber.recuperer());
            }
        } catch (NumberFormatException e) {
            System.err.println("Contenu invalide pour le type " + type);
            System.exit(1);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    private static <T> Boite<T> createAndAddToBoite(T contenu) {
        Boite<T> boite = new Boite<>();
        boite.ajouter(contenu);
        return boite;
    }

    private static Number parseNumber(String type, String contenu) {
        switch (type.toLowerCase()) {
            case "integer":
                return Integer.parseInt(contenu);
            case "double":
                return Double.parseDouble(contenu);
            case "float":
                return Float.parseFloat(contenu);
            case "long":
                return Long.parseLong(contenu);
            default:
                throw new IllegalArgumentException("Type invalide : " + type);
        }
    }
}