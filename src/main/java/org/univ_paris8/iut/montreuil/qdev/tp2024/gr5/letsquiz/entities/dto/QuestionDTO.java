package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.Niveau;

import java.util.Objects;

public class QuestionDTO {

    private Integer numéro;

    private Langue langue;

    private String libellé;

    private String réponse;

    private Niveau niveau;

    private String explication;

    private String source;

    public Integer getNuméro() {
        return numéro;
    }

    public void setNuméro(Integer numéro) {
        this.numéro = numéro;
    }

    public Langue getLangue() {
        return langue;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    public String getLibellé() {
        return libellé;
    }

    public void setLibellé(String libellé) {
        this.libellé = libellé;
    }

    public String getRéponse() {
        return réponse;
    }

    public void setRéponse(String réponse) {
        this.réponse = réponse;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public String getExplication() {
        return explication;
    }

    public void setExplication(String explication) {
        this.explication = explication;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Question{" +
                "numéro=" + numéro +
                ", langue=" + langue +
                ", libellé='" + libellé + '\'' +
                ", réponse='" + réponse + '\'' +
                ", niveau=" + niveau +
                ", explication='" + explication + '\'' +
                ", source='" + source + '\'' +
                '}';
    }

    public QuestionDTO(Integer numéro, String langue, String libellé, String réponse,
                       String niveau, String explication, String source) {

        this.numéro = numéro;
        this.langue = Langue.getByCode(langue);
        this.libellé = libellé;
        this.réponse = réponse;
        this.niveau = Niveau.getByValeur(Integer.valueOf(niveau));
        this.explication = explication;
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuestionDTO)) return false;

        QuestionDTO question = (QuestionDTO) o;

        if (!Objects.equals(numéro, question.numéro)) return false;
        if (langue != question.langue) return false;
        if (!Objects.equals(libellé, question.libellé)) return false;
        if (!Objects.equals(réponse, question.réponse)) return false;
        if (niveau != question.niveau) return false;
        if (!Objects.equals(explication, question.explication))
            return false;
        return Objects.equals(source, question.source);
    }

    @Override
    public int hashCode() {
        int result = numéro != null ? numéro.hashCode() : 0;
        result = 31 * result + (langue != null ? langue.hashCode() : 0);
        result = 31 * result + (libellé != null ? libellé.hashCode() : 0);
        result = 31 * result + (réponse != null ? réponse.hashCode() : 0);
        result = 31 * result + (niveau != null ? niveau.hashCode() : 0);
        result = 31 * result + (explication != null ? explication.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        return result;
    }

}
