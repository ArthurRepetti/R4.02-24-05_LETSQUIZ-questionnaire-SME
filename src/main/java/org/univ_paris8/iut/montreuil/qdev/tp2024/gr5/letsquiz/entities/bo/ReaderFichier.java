package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.bo;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionDTO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReaderFichier {

    private final Path chemin = Paths.get("/Users/arsanabdi/eclipse-workspace/R4.02-24-05_LETSQUIZ-questionnaire-SME/src/site/questionsQuizz.csv");

    private List<String> contenu;

    public ReaderFichier() {

        this.contenu = new ArrayList<>();
    }

    public List<String> extraireContenuFichier() {

        try {

            this.contenu = Files.readAllLines(this.chemin);

            return this.contenu;
        } catch (IOException e) {

            System.out.println("Problème lecture de fichier");
        }
        return null;
    }

    public QuestionDTO transformerLigneEnQuestion(String ligne) {

        String[] lesElementsDeLaQuestion = ligne.split(";");
        for (String bout : lesElementsDeLaQuestion) {

            System.out.println(bout + "\n");
        }
        QuestionDTO questionFinale = new QuestionDTO(
                Integer.valueOf(lesElementsDeLaQuestion[1]),
                lesElementsDeLaQuestion[2],
                lesElementsDeLaQuestion[3],
                lesElementsDeLaQuestion[4],
                lesElementsDeLaQuestion[5],
                lesElementsDeLaQuestion[6],
                lesElementsDeLaQuestion[7]);

        return questionFinale;
    }
}
