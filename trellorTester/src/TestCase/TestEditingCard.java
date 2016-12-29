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
public class TestEditingCard {

    public static void editingCards(String idCard, String nameCard, String descCard) {

        Card card = new Card();
        card.setName(nameCard);
        card.setDesc(descCard);

        CardController cardController = new CardController();

        cardController.editCardDescription(descCard, idCard);
    }
}
