package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto;

import java.util.HashSet;
import java.util.Set;

public class QuestionnaireDTO {

    private static Integer valeur = 1;
    private Integer id;
    private Set<String> listeDesQuestions;

    public QuestionnaireDTO() {
        this.id = valeur;
        this.listeDesQuestions = new HashSet<>();

        valeur++;
    }
}
