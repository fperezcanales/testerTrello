/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuConsole;

import Controller.BoardController;
import Resource.Board;
import Resource.Card;
import Resource.List;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class MenuToShowAllData {

    public static Board[] getBoardAndCards() {

        Board[] boards = null;

        try {
            System.out.println("Getting all boards and cards of user () ... wait please ...");
            BoardController bc = new BoardController();

            boards = bc.getAllBoard();

            for (int i = 0; i < boards.length; i++) {  //Iterating BOARDS
                System.out.println("\t" + boards[i].toString());

                List[] lists = bc.getListByBoard(boards[i].getId());
                boards[i].setListOfBoards(lists);

                for (int j = 0; j < lists.length; j++) { //Iterating LISTS
                    System.out.println("\t\t" + lists[j].toString());

                    Card[] cards = bc.getCardByBoard(lists[j].getId());
                    lists[j].setListOfCards(cards);

                    if (cards != null) {
                        for (int k = 0; k < cards.length; k++) {  //Iterating CARDS
                            System.out.println("\t\t\t" + cards[k].toString());
                        }
                    }
                }
            }
            System.out.println("\n");

        } catch (Exception e) {
            System.out.println("Uoop! Error!");
        }
        return boards;
    }

    public static Board[] getBoardAndCardsHidden() {
        Board[] boards = null;

        try {
            System.out.println("Please wait ...");
            BoardController bc = new BoardController();

            boards = bc.getAllBoard();

            for (int i = 0; i < boards.length; i++) {  //Iterating BOARDS

                List[] lists = bc.getListByBoard(boards[i].getId());
                boards[i].setListOfBoards(lists);

                for (int j = 0; j < lists.length; j++) { //Iterating LISTS

                    Card[] cards = bc.getCardByBoard(lists[j].getId());
                    lists[j].setListOfCards(cards);
                }
            }
            System.out.println("\n");

        } catch (Exception e) {
            System.out.println("Uoop! Error!");
        }
        return boards;
    }
}
