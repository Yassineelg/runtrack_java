/*
    EtudiantTest.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 06/09/2023 13:40:26
*/

public class EtudiantTest {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("Bob");

        try {
            etudiant.ajouterNote(15);
            etudiant.ajouterNote(12);
            etudiant.ajouterNote(18);
            etudiant.ajouterNote(10);

            System.out.println("Nom de l'étudiant: " + etudiant.nom);
            System.out.println("Notes: " + etudiant.notes);
            System.out.println("Note la plus haute: " + etudiant.getNoteMax());
            System.out.println("Note la plus basse: " + etudiant.getNoteMin());
            System.out.println("Moyenne: " + etudiant.getMoyenne());
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}