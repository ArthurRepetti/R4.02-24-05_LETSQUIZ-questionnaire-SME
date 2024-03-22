package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.impls;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Enum.*;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionDTOTest {

    private QuestionDTO questionDTO;

    @BeforeEach
    public void setup() {

        this.questionDTO = new QuestionDTO(1, "fr", "Comment s'appelle le meilleur prof ?", "Jeremy",
                "1", "Le meilleur prof est Jeremy", "https://fr.wikipedia.org/wiki");
    }

    @Test
    public void testQuestionDTOCreation() {

        assertNotNull(this.questionDTO, "L'instance de QuestionDTO ne devrait pas être nulle");
        assertEquals(Langue.français, this.questionDTO.getLangue(), "La langue devrait être 'français'");
        assertEquals(Niveau.un, this.questionDTO.getNiveau(), "Le niveau devrait être 'un'");
        assertEquals("Comment s'appelle le meilleur prof ?", this.questionDTO.getLibellé(), "Le libellé ne correspond pas");
        assertEquals("Jeremy", this.questionDTO.getRéponse(), "La réponse ne correspond pas");
        assertEquals("Le meilleur prof est Jeremy", this.questionDTO.getExplication(), "L'explication ne correspond pas");
        assertEquals("https://fr.wikipedia.org/wiki", this.questionDTO.getSource(), "La source ne correspond pas");
    }
}

