package org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.bo.ReaderFichier;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.Exceptions.ErreurSaisieChoix;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.Menu;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr5.letsquiz.entities.dto.Question;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, ErreurSaisieChoix {

        Menu menu = new Menu();
        do {
            menu.afficherLeMenu();
            try {
                menu.demandeDuChoixDuUser();
            } catch (ErreurSaisieChoix e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
