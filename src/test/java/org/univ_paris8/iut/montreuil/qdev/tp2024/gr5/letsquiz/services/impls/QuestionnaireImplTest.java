package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.impls;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.*;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Enum.*;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Exceptions.*;

import java.io.IOException;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuestionnaireImplTest {

    private QuestionnaireImpl questionnaire;

    @TempDir
    Path chemin;

    @BeforeEach
    public void setup() {

        this.questionnaire = new QuestionnaireImpl();
    }

    @Test
    public void testChargeQuestionnaire() throws IOException, FichierNonTrouveException, ErreurLectureFichierException {

        Path fichier = this.chemin.resolve("questions.csv");
        Files.writeString(fichier, "1;1;fr;aa?;aa;1;aa;aa\n" + "1;2;fr;bb?;bb;1;bb;bb");

        QuestionnairesDTO questionnairesDTO = this.questionnaire.chargerQuestionnaire(fichier.toString());

        Assertions.assertFalse(questionnairesDTO.getListeQuestionnaires().isEmpty());
        Assertions.assertEquals(1, questionnairesDTO.getListeQuestionnaires().size());
        Assertions.assertEquals(2, questionnairesDTO.getListeQuestionnaires().get(0).getQuestions().size());
    }

    @Test
    public void testFichierNonTrouveException() {

        Path fichier = this.chemin.resolve("file.csv");

        assertThrows(FichierNonTrouveException.class, () -> {

            this.questionnaire.chargerQuestionnaire(fichier.toString());
        });
    }

    @Test
    public void testTransformLigneEnQuestionDTO() throws FormatInvalideException, QuestionInvalideException {

        String ligne = "1;1;fr;aa;aa;1;aa;aa";

        QuestionDTO questionDTO = this.questionnaire.transformerLigneEnQuestion(ligne);

        Assertions.assertEquals(1, questionDTO.getNuméro());
        Assertions.assertEquals(Langue.français, questionDTO.getLangue());
        Assertions.assertEquals("aa", questionDTO.getLibellé());
        Assertions.assertEquals("aa", questionDTO.getRéponse());
        Assertions.assertEquals(Niveau.un, questionDTO.getNiveau());
        Assertions.assertEquals("aa", questionDTO.getExplication());
        Assertions.assertEquals("aa", questionDTO.getSource());
    }

    @Test
    public void testFormatFichierInvalideException() {

        String ligneFausse = "1;1;fr;aa";

        assertThrows(FormatInvalideException.class, () -> {

            this.questionnaire.transformerLigneEnQuestion(ligneFausse);
        });
    }

    @Test
    public void testThrowQuestionInvalideExceptionLigneNull() {

        String ligneNull = null;

        assertThrows(QuestionInvalideException.class, () -> {
            this.questionnaire.transformerLigneEnQuestion(ligneNull);
        });
    }

    @Test
    public void testThrowFormatFichierInvalideExceptionSurNombreDeMorceauxIncorrect() {

        String ligneIncomplete = "1;fr;aa;a";
        QuestionnaireImpl questionnaireImpl = new QuestionnaireImpl();

        assertThrows(FormatInvalideException.class, () -> {

            questionnaireImpl.transformerLigneEnQuestion(ligneIncomplete);
        });
    }

    @Test
    public void testThrowFormatFichierInvalideExceptionSurLangueCodeIncorrect() {

        String ligneAvecMauvaisCodeLangue = "1;xx;aa;aa;1;aa;aa";
        QuestionnaireImpl questionnaireImpl = new QuestionnaireImpl();

        assertThrows(FormatInvalideException.class, () -> {

            questionnaireImpl.transformerLigneEnQuestion(ligneAvecMauvaisCodeLangue);
        });
    }

    @Test
    public void testThrowFormatFichierInvalideExceptionQuandNiveauInvalide() {

        String mauvaiseValeurDeNiveau = "1;1;fr;aa;aa;xx;aa;aa";
        QuestionnaireImpl questionnaireImpl = new QuestionnaireImpl();

        assertThrows(FormatInvalideException.class, () -> {

            questionnaireImpl.transformerLigneEnQuestion(mauvaiseValeurDeNiveau);
        });
    }

    @Test
    public void whenFileDoesNotExist_thenThrowFichierNonTrouveException() {

        QuestionnaireImpl questionnaireImpl = new QuestionnaireImpl();
        String FichierInexistant = "fichier.csv";

        assertThrows(FichierNonTrouveException.class, () -> {

            questionnaireImpl.chargerQuestionnaire(FichierInexistant);
        });
    }

    @Test
    public void testThrowFichierNonTrouveExceptionSurFichierNonTrouve() {

        QuestionnaireImpl questionnaireImpl = new QuestionnaireImpl();
        String mauvaisPath = "srv/main/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr5/letsquiz/utils/questionsQuizz.csv";

        assertThrows(FichierNonTrouveException.class, () -> {

            questionnaireImpl.chargerQuestionnaire(mauvaisPath);
        });
    }

}
