package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.Poubelle;

public enum Niveau {
    un(1), deux(2), trois(3);

    private final Integer valeur;

    public static Niveau getByValeur(Integer valeur) {

        for (Niveau niveau : Niveau.values()) {

            if (niveau.valeur.equals(valeur)) {

                return niveau;
            }
        }
        throw  new IllegalArgumentException("Pas encore ce niveau pour l'instant");
    }
    private Niveau(Integer valeur) {

        this.valeur = valeur;
    }

    public Integer getValeur() {

        return this.valeur;
    }
}
