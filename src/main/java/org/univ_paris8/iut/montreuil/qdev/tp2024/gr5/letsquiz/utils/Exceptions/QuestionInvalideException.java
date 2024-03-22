package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Exceptions;

public class QuestionInvalideException extends Exception {

    public QuestionInvalideException(String message) {

        super(message);
    }

    public QuestionInvalideException(String message, Throwable cause) {

        super(message, cause);
    }
}

