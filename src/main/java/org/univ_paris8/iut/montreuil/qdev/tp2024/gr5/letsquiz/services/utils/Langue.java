package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.services.utils;

public enum Langue {

    français("fr"), english("en"), spanish("es");

    private final String code;

    public static Langue getByCode(String code) {

        for(Langue langue : Langue.values()) {

            if(langue.code.equals(code)) {

                return langue;
            }
        }
        throw new IllegalArgumentException("Code non valide pour Langue: " + code);
    }

    private Langue(String code) {

        this.code = code;
    }

    public String getCode() {

        return this.code;
    }
}
