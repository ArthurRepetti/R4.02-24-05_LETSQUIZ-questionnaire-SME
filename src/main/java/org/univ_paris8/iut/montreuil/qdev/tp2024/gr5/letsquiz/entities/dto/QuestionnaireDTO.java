package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto;

import java.util.HashSet;
import java.util.Set;

public class QuestionnaireDTO {

    private static Integer valeur = 1;
    private Integer id;
    private Set<QuestionDTO> listeDesQuestions; // Utilisation de QuestionDTO au lieu de String

    public QuestionnaireDTO() {
        this.id = valeur;
        this.listeDesQuestions = new HashSet<>();
        valeur++;
    }

    public static Integer getValeur() {
        return valeur;
    }

    public static void setValeur(Integer valeur) {
        QuestionnaireDTO.valeur = valeur;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<QuestionDTO> getListeDesQuestions() {
        return listeDesQuestions;
    }

    public void setListeDesQuestions(Set<QuestionDTO> listeDesQuestions) {
        this.listeDesQuestions = listeDesQuestions;
    }
// Getters and setters for id and listeDesQuestions...
}

