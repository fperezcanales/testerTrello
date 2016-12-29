/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuConsole;
import Resource.BoardCard;
import TestCase.TestEditingCard;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class MenuToEdit {

    static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
    static int select = -1; //opción elegida del usuario
    static int num1 = 0, num2 = 0; //Variables

    public static void menuToEdit(ArrayList<BoardCard> cardsList) {

            try {
                System.out.println("\tSelect card to edit:");
                for(int k=0; k<cardsList.size(); k++){
                    System.out.println("\t\t"+(k+1)+".-"+cardsList.get(k).toString());
                }
                System.out.print("\tEnter Card Number to edit: "); 

                String indexCard = scanner.nextLine();

                System.out.print("\tEdit descripction: ");
                String newDesc = scanner.nextLine();
                
                String idCardSt = cardsList.get(Integer.parseInt(indexCard)-1).getIdCard();
                TestEditingCard.editingCards(idCardSt , "", newDesc);

                System.out.println("\n"); 

            } catch (Exception e) {
                System.out.println("Uoop! Error!");
            }
    }

    public static void askNumbersToEdit(ArrayList<BoardCard> cardsList){
        menuToEdit(cardsList);
    }
}
