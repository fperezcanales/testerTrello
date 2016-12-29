/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resource;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author Fernando
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class List {
 
    private String name;
    private String id;
    private Card[] listOfCards ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Card[] getListOfCards() {
        return listOfCards;
    }

    public void setListOfCards(Card[] listOfCards) {
        this.listOfCards = listOfCards;
    }

    @Override
    public String toString() {
        return "List{" + "name=" + name + ", id=" + id + '}';
    }
}
