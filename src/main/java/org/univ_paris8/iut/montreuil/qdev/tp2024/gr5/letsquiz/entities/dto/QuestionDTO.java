package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Enum.*;

public class QuestionDTO {

    private Integer numéro;

    private Langue langue;

    private String libellé;

    private String réponse;

    private Niveau niveau;

    private String explication;

    private String source;

    public QuestionDTO(Integer numéro, String langue, String libellé, String réponse,
                       String niveau, String explication, String source) {

        this.numéro = numéro;
        this.langue = Langue.getByCode(langue);
        this.libellé = libellé;
        this.réponse = réponse;
        this.niveau = Niveau.getByValeur(Integer.valueOf(niveau));
        this.explication = explication;
        this.source = source;
    }

    public Integer getNuméro() {

        return this.numéro;
    }

    public Langue getLangue() {

        return this.langue;
    }

    public String getLibellé() {

        return this.libellé;
    }

    public String getRéponse() {

        return this.réponse;
    }

    public Niveau getNiveau() {

        return this.niveau;
    }

    public String getExplication() {

        return this.explication;
    }

    public String getSource() {
        return source;
    }
}

