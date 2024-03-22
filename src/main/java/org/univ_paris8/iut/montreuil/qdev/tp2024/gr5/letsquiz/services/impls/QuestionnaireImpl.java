package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.impls;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.*;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.interfaces.IQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Enum.*;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Exceptions.*;

import java.nio.file.*;
import java.io.*;

public class QuestionnaireImpl implements IQuestionnaire {
    @Override
    public QuestionnairesDTO chargerQuestionnaire(String url) throws FichierNonTrouveException, ErreurLectureFichierException {
        QuestionnairesDTO questionnaires = new QuestionnairesDTO();
        Path chemin = Paths.get(url);

        if (!Files.exists(chemin)) {
            throw new FichierNonTrouveException("fichier " + url + " pas trouvé");
        }

        try (BufferedReader lecteur = Files.newBufferedReader(chemin)) {

            lecteur.mark(1);
            if (lecteur.read() != 0xFEFF) {

                lecteur.reset();
            }

            Integer numDuQuestionnaire = null;
            QuestionnaireDTO questionnaireActuel = null;

            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                try {

                    QuestionDTO question = transformerLigneEnQuestion(ligne);
                    Integer numero = Integer.parseInt(String.valueOf(ligne.charAt(0)));
                    if (!numero.equals(numDuQuestionnaire)) {

                        numDuQuestionnaire = numero;
                        questionnaireActuel = new QuestionnaireDTO(numDuQuestionnaire);
                        questionnaires.addQuestionnaire(questionnaireActuel);
                    }
                    questionnaireActuel.addQuestion(question);
                } catch (FormatInvalideException | QuestionInvalideException e) {

                    System.err.println("erreur dans la ligne: " + ligne + e.getMessage());
                }
            }
        } catch (IOException e) {

            throw new ErreurLectureFichierException("Erreur lecture du fichier: " + e.getMessage(), e);
        }

        return questionnaires;
    }

    public QuestionDTO transformerLigneEnQuestion(String ligne) throws FormatInvalideException, QuestionInvalideException {

        if (ligne == null || ligne.trim().isEmpty()) {

            throw new QuestionInvalideException("ligne nulle ou vide");
        }

        String[] morceauxDeLigne = ligne.trim().split(";");
        if (morceauxDeLigne.length < 8) {
            throw new FormatInvalideException("ligne n'a pas assez de morceaux : " + ligne);
        }

        try {

            Integer id = Integer.parseInt(morceauxDeLigne[1]);
            Langue langue = Langue.getByCode(morceauxDeLigne[2]);
            String libelle = morceauxDeLigne[3];
            String réponse = morceauxDeLigne[4];
            Niveau niveau = Niveau.getByValeur(Integer.parseInt(morceauxDeLigne[5]));
            String explication = morceauxDeLigne[6];
            String source = morceauxDeLigne[7];

            return new QuestionDTO(id, langue.getCode(), libelle, réponse, niveau.getValeur().toString(), explication, source);
        } catch (NumberFormatException e) {

            throw new FormatInvalideException("erreur de format numérique dans la ligne: " + ligne, e);
        }
    }
}




