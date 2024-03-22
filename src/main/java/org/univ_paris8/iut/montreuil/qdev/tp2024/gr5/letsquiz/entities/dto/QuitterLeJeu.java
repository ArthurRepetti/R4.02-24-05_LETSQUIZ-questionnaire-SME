package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto;

public class QuitterLeJeu extends Bouton {


    public QuitterLeJeu() {

        super(6, "Quitter le jeu");
    }

    @Override
    public void execute() {

        System.exit(0);
    }
}
