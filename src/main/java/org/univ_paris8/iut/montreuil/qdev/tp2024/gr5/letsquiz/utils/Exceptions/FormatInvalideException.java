package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Exceptions;

public class FormatInvalideException extends Exception {

    public FormatInvalideException(String message) {

        super(message);
    }

    public FormatInvalideException(String message, Throwable cause) {

        super(message, cause);
    }
}