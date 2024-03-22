package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.Poubelle;

import java.util.Scanner;

public class AfficherLesRègles extends Bouton {

    public AfficherLesRègles() {

        super(5, "Afficher la règle");
    }

    @Override
    public void execute() {

        System.out.println("\t *** Les règles ***\n");
        System.out.println("Voici un jeu de quizz classique.");
        System.out.println("Vous devez répondre exactement aux 10 questions choisies aléatoirement.");
        System.out.println("+1 point en cas de réponse exact.");
        System.out.println("+2 points pour les questions expertes");
        System.out.println("0 en cas d’erreur. \n\n");
        System.out.println("Appuyez sur une touche pour revenir au menu…");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
