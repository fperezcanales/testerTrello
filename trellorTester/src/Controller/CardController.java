/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Resource.Card;
import java.net.URLEncoder;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Fernando
 */
public class CardController {

    //Create Card
    public void addingCard(Card newCard, String idList) {

        String url = TrelloTester.prop.getProperty("urlAddCardToList").replace("ididListReplaceHere", idList);

        try {

            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(url);

            Invocation.Builder builder = target.request();
            Response response = builder.post(Entity.entity(newCard, MediaType.APPLICATION_JSON_TYPE));

            String responseAsString = response.readEntity(String.class);

            System.out.println("\n\tHttpCode Response: " + response.getStatus());

            if (response.getStatus() == 200) {

                ObjectMapper mapper = new ObjectMapper();

                Card myNewObject = mapper.readValue(responseAsString, Card.class);

                System.out.println("\tCard was added: " + myNewObject.toString());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    //Delete Card
    public void deleting(String idCard) {

        String url = TrelloTester.prop.getProperty("urlDeletingCard").replace("idCardReplaceHere", idCard);

        try {

            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(url);

            Invocation.Builder builder = target.request();
            Response response = builder.delete();

            String responseAsString = response.readEntity(String.class);

            System.out.println("\n\tHttpCode Response: " + response.getStatus());

            if (response.getStatus() == 200) {
                System.out.print("\tCard '" + idCard + "' was deleted!");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    //Edit Card
    public void editCardDescription(String descUpdated, String idCardUpdate) {

        String url = TrelloTester.prop.getProperty("urlEditCardsDesc").replace("idCardReplaceHere", idCardUpdate);

        try {

            descUpdated = URLEncoder.encode(descUpdated, "UTF-8");

            url = url.replace("valueReplaceHere", descUpdated);

            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(url);

            Invocation.Builder builder = target.request();

            Card newCard = new Card();

            Response response = builder.put(Entity.entity(newCard, MediaType.APPLICATION_JSON_TYPE));

            String responseAsString = response.readEntity(String.class);

            System.out.println("\n\tHttpCode Response: " + response.getStatus());

            if (response.getStatus() == 200) {
                
                ObjectMapper mapper = new ObjectMapper();

                Card myObjectEdited = mapper.readValue(responseAsString, Card.class);
                
                System.out.print("\tCard '" + idCardUpdate + "' was edited! : "+myObjectEdited.toString());
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
