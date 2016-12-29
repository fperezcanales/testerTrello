/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import Resource.Board;
import Resource.Card;
import Resource.List;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Fernando
 */
public class BoardController {
 
    // get All Boards
    public Board[] getAllBoard() {

        String urlGetBoardsMember = TrelloTester.prop.getProperty("urlGetBoard");
        
        //System.out.println("urlGetBoardsMember "+urlGetBoardsMember);
        Board[] myObjects = null;

        try {

            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(urlGetBoardsMember);

            Invocation.Builder builder = target.request();
            Response response = builder.get();

            String responseAsString = response.readEntity(String.class);

            ObjectMapper mapper = new ObjectMapper();

            myObjects = mapper.readValue(responseAsString, Board[].class);

        } catch (Exception e) {
            System.err.println(e);
        }
        return myObjects;
    }

    // get All Lists

    public List[] getListByBoard(String idBoard) {

        String urlGetListOfBoardAux = TrelloTester.prop.getProperty("urlGetListOfBoard");

        //System.out.println("urlGetListOfBoardAux "+urlGetListOfBoardAux);
        
        urlGetListOfBoardAux = urlGetListOfBoardAux.replaceAll("idBoardReplaceHere", idBoard);

        List[] myObjects = null;

        try {

            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(urlGetListOfBoardAux);

            Invocation.Builder builder = target.request();
            Response response = builder.get();
            
            String responseAsString = response.readEntity(String.class);

            ObjectMapper mapper = new ObjectMapper();

            myObjects = mapper.readValue(responseAsString, List[].class);

        } catch (Exception e) {
            System.err.println(e);
        }
        return myObjects;

    }

    // get Cards by idList
    public Card[] getCardByBoard(String idList) {

        Card[] myObjects = null;
        try {

            String urlGetCardsByListAux = TrelloTester.prop.getProperty("urlGetCardsToList");

            urlGetCardsByListAux = urlGetCardsByListAux.replaceAll("idListSelected",idList);
            
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(urlGetCardsByListAux);

            Invocation.Builder builder = target.request();
            Response response = builder.get();

            String responseAsString = response.readEntity(String.class);

            ObjectMapper mapper = new ObjectMapper();

            myObjects = mapper.readValue(responseAsString, Card[].class);

        } catch (Exception e) {
            System.err.println(e);
        }

        return myObjects;
    }
}
