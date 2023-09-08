/*
    Boite.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 08/09/2023
*/

public class Boite<T> {
    private T contenu;

    public void ajouter(T element) throws IllegalArgumentException {
        if (element instanceof Number || element instanceof String) {
            contenu = element;
        } else {
            throw new IllegalArgumentException("Contenu invalide pour le type " + element.getClass().getSimpleName());
        }
    }

    public T recuperer() {
        return contenu;
    }
}