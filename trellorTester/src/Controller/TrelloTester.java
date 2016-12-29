/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import MenuConsole.MenuToAddCard;
import MenuConsole.MenuToDelete;
import MenuConsole.MenuToEdit;
import MenuConsole.MenuToShowAllData;
import Properties.ReadProperties;
import Resource.Board;
import Resource.BoardCard;
import Resource.Card;
import Resource.List;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class TrelloTester {

    static Scanner scanner = new Scanner(System.in); //To get text by console
    static int select = -1; //User option
    static int num1 = 0, num2 = 0; //Variables

    static Properties prop;

    public static void main(String[] args) {

        ReadProperties properties = new ReadProperties();
        prop = properties.getProperties();

        //Test conecting to API Trello
        
        //System.out.println("Getting all boards and cards of user () ... wait please ...");      
        Board[] boards = null;//MenuToShowAllData.getBoardAndCardsHidden();
        ArrayList<BoardCard> cardsList = null; //getCards(boards);

        //for (int k = 0; k < cardsList.size(); k++) {
          //  System.out.println("\t" + (k + 1) + ".-" + cardsList.get(k).toString());
        //}
        
        //While the choice is 0, we ask the user
        while (select != 0) {
            //Try catch to avoid the program finished if there is an error
            try {

                System.out.println("Select option:"
                        + "\n1.- Add card to Board\n"
                        + "2.- Edit card\n"
                        + "3.- Delete card\n"
                        + "4.- Show Boards and Cards as JSON\n"
                        + "0.- Quit");
                //Get variable per console
                select = Integer.parseInt(scanner.nextLine());

                switch (select) {

                    case 1:

                        boards = MenuToShowAllData.getBoardAndCardsHidden();
                        //cardsList = getCards(boards);
                        MenuToAddCard.askNumbersToAdd(boards);
                        break;
                    case 2:
                        boards = MenuToShowAllData.getBoardAndCardsHidden();
                        cardsList = getCards(boards);
                        MenuToEdit.askNumbersToEdit(cardsList);
                        break;
                    case 3:
                        boards = MenuToShowAllData.getBoardAndCardsHidden();
                        cardsList = getCards(boards);
                        MenuToDelete.askNumbersToDelete(cardsList);
                        break;
                    case 4:
                        boards = MenuToShowAllData.getBoardAndCards();
                        cardsList = getCards(boards);
                        break;
                    case 0:
                        System.out.println("Bye!");
                        break;
                    default:
                        System.out.println("It is no option, try again:");
                        break;
                }

                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Uoop! Error!");
            }
        }
    }

    private static ArrayList<BoardCard> getCards(Board[] boards) {
        ArrayList<BoardCard> listBoardCard = new ArrayList<>();
        BoardCard bc;
        Card c;
        List l;
        Board b;

        for (int i = 0; i < boards.length; i++) {
            for (int j = 0; j < boards[i].getListOfBoards().length; j++) {
                for (int k = 0; k < boards[i].getListOfBoards()[j].getListOfCards().length; k++) {

                    c = new Card();
                    c.setName(boards[i].getListOfBoards()[j].getListOfCards()[k].getName());
                    c.setId(boards[i].getListOfBoards()[j].getListOfCards()[k].getId());
                    c.setDesc(boards[i].getListOfBoards()[j].getListOfCards()[k].getDesc());

                    l = new List();
                    l.setName(boards[i].getListOfBoards()[j].getName());
                    l.setId(boards[i].getListOfBoards()[j].getId());

                    b = new Board();
                    b.setName(boards[i].getName());
                    b.setId(boards[i].getId());

                    bc = new BoardCard(b, l, c);
                    listBoardCard.add(bc);
                }
            }
        }
        return listBoardCard;
    }
}
