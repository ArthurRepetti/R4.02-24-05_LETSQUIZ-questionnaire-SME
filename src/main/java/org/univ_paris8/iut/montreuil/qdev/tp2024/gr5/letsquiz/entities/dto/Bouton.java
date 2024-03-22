package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto;

public abstract class Bouton {

    private Integer num;
    private String intitulé;

    public Bouton(Integer num, String intitulé) {

        this.num = num;
        this.intitulé = intitulé;
    }

    public Integer getNum() {
        return num;
    }

    public abstract void execute();

    @Override
    public String toString() {

        return this.num + "." + this.intitulé + ".";
    }
}
