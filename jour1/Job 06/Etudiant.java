/*
    EtudiantTest.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 06/09/2023
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Etudiant {
    public String nom;
    public List<Integer> notes;

    public Etudiant(String nom) {
        this.nom = nom;
        this.notes = new ArrayList<>();
    }

    public void ajouterNote(int note) {
        if (note >= 0 && note <= 20) {
            notes.add(note);
        } else {
            throw new IllegalArgumentException("La note doit être comprise entre 0 et 20.");
        }
    }

    public int getNoteMax() {
        if (notes.isEmpty()) {
            throw new IllegalStateException("Aucune note n'a été enregistrée.");
        }
        return Collections.max(notes);
    }

    public int getNoteMin() {
        if (notes.isEmpty()) {
            throw new IllegalStateException("Aucune note n'a été enregistrée.");
        }
        return Collections.min(notes);
    }

    public double getMoyenne() {
        if (notes.isEmpty()) {
            throw new IllegalStateException("Aucune note n'a été enregistrée.");
        }
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return (double) somme / notes.size();
    }
}