package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.bo;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.Question;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class Questionnaire {

    private static Integer valeur = 1;

    private Integer id;
    private Set<Question> listeDesQuestions;

    public Questionnaire() {

        this.id = valeur;
        this.listeDesQuestions = new HashSet<>();

        valeur++;
    }

    public void ajouterQuestion(Question question) {

        this.listeDesQuestions.add(question);
    }
}
