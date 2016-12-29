/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuConsole;
import Resource.BoardCard;
import TestCase.TestDeletingCard;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class MenuToDelete {

    static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
    static int select = -1; //opción elegida del usuario
    static int num1 = 0, num2 = 0; //Variables

    public static void menuToDelete(ArrayList<BoardCard> cardsList) {

            try {
                System.out.println("\tSelect card to delete:");
                for(int k=0; k<cardsList.size(); k++){
                    System.out.println("\t\t"+(k+1)+".-"+cardsList.get(k).toString());
                }
                System.out.print("\tEnter Card Number to delete: "); 
 
                String indexCard = scanner.nextLine();

                String idCardSt = cardsList.get(Integer.parseInt(indexCard)-1).getIdCard();
                
                TestDeletingCard.delitingCards(idCardSt);
                
                System.out.println("\n"); 

            } catch (Exception e) {
                System.out.println("Uoop! Error!");
            }
    }

    public static void askNumbersToDelete(ArrayList<BoardCard> list){
        menuToDelete(list);
    }
}
