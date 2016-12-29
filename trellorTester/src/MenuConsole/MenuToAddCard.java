/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuConsole;

import Resource.Board;
import TestCase.TestAddingCard;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class MenuToAddCard {

    static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
    static int select = -1; //opción elegida del usuario
    static int num1 = 0, num2 = 0; //Variables

    public static void menuToAdd(Board[] boards) {

        try {
            System.out.println("Create new card:");
            System.out.print("\t Enter Name:");
            String newName = scanner.nextLine();
            System.out.print("\t Enter Description:");
            String newDesc = scanner.nextLine();
            System.out.println("");

            //Select Board and List
            System.out.println("\tSelect Board to add card:");
            int k;
            for (k = 0; k < boards.length; k++) {
                System.out.println("\t\t"+(k + 1) + ".- " + boards[k].toString());
            }
            System.out.print("\tSelect Board number: "); 
            String indexBoard = scanner.nextLine();

            Integer indexSelected = Integer.parseInt(indexBoard);
            
            System.out.println("\tSelect a List to add card:");
            for (int j = 0; j < boards[(indexSelected-1)].getListOfBoards().length; j++) {
                System.out.println("\t\t"+(j + 1) + ".- " 
                        + boards[(indexSelected-1)].getListOfBoards()[j].toString());
            }

            System.out.print("\tEnter List  number: "); 

            String indexList = scanner.nextLine();

            indexList = getIdList(Integer.parseInt(indexBoard), Integer.parseInt(indexList), boards);
            TestAddingCard.addCards(indexList, newName, newDesc);
            
            //System.out.println("\n "+indexList);

        } catch (Exception e) {
            System.out.println("Uoop! Error!");
        }
    }

    public static void askNumbersToAdd(Board[] boards) {

        menuToAdd(boards);
    }

    private static String getIdList(int indexBoard, int indexList, Board[] boards) {
        String idList = "";
        idList = boards[indexBoard-1].getListOfBoards()[indexList-1].getId();
        return idList;
    }
}
