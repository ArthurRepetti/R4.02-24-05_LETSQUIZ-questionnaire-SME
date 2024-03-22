package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionnairesDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Exceptions.ErreurLectureFichierException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Exceptions.FichierNonTrouveException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Exceptions.FormatInvalideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Exceptions.QuestionInvalideException;

public interface IQuestionnaire {

    public QuestionnairesDTO chargerQuestionnaire(String url) throws FichierNonTrouveException, ErreurLectureFichierException;

    public QuestionDTO transformerLigneEnQuestion(String ligne) throws FormatInvalideException, QuestionInvalideException;
}
