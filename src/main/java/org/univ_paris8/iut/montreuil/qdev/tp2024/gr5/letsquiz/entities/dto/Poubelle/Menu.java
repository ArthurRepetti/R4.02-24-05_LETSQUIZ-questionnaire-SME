package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.Poubelle;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.utils.ErreurSaisieChoix;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private ArrayList<Bouton> lesBoutonsDuMenu;
    public Menu() throws ErreurSaisieChoix {

        this.lesBoutonsDuMenu = new ArrayList<>();
        ajouterLesBoutonsAuMenu(this.lesBoutonsDuMenu);
    }
    public void afficherLeMenu() {

        System.out.println("Bienvenue dans le jeu du Quizz !!!\n");
        for (Bouton bouton : this.lesBoutonsDuMenu) {

            System.out.println(bouton);
        }
        System.out.println("");
    }

    public void ajouterLesBoutonsAuMenu(ArrayList<Bouton> liste) {

        liste.add(new AjouterSupprimerJoueur());
        liste.add(new LancerPartie());
        liste.add(new VoirLeClassement());
        liste.add(new VoirLesStatistiques());
        liste.add(new AfficherLesRègles());
        liste.add(new QuitterLeJeu());

    }

    public void demandeDuChoixDuUser() throws ErreurSaisieChoix {
        Scanner scanner = new Scanner(System.in);
        boolean choixValide = false;

        try {
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();

            for (Bouton bouton : this.lesBoutonsDuMenu) {
                if (bouton.getNum() == choix) {

                    choixValide = true;
                    bouton.execute();
                    break;
                }
            }

            if (!choixValide) {
                throw new ErreurSaisieChoix("saisis plutôt un nombre entre 1 et " + this.lesBoutonsDuMenu.size());
            }

        } catch (InputMismatchException e) {

            throw new ErreurSaisieChoix("saisie non valide");
        } finally {

            scanner.nextLine();
        }
    }


}
