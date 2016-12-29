/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCase;

import Resource.Card;
import Controller.CardController;

/**
 *
 * @author Fernando
 */
public class TestDeletingCard {

    public static void delitingCards(String idCard) {

        CardController cardController = new CardController();

        cardController.deleting(idCard);
    }
}
