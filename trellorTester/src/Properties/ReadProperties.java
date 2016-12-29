package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

    public static Properties getProperties() {

        Properties prop = new Properties();
        try {
            
            String keyAndToken = "key=" + Trello.key  + "&token=" + Trello.token;
            
            String urlGetBoard = Trello.urlMembers + keyAndToken;
            prop.setProperty("urlGetBoard", urlGetBoard);
            
            String urlGetListOfBoard = Trello.urlGetListOfBoard + keyAndToken;
            prop.setProperty("urlGetListOfBoard", urlGetListOfBoard);

            String urlGetCardsToList =  Trello.urlGetCardsToList + keyAndToken;
            prop.setProperty("urlGetCardsToList", urlGetCardsToList);
            
            String urlAddCardToList = Trello.urlCards + "?" + keyAndToken + "&idList=ididListReplaceHere" ;
            prop.setProperty("urlAddCardToList", urlAddCardToList);
            
            String urlDeletingCard = Trello.urlCards + "idCardReplaceHere?" + keyAndToken;
            prop.setProperty("urlDeletingCard", urlDeletingCard);
            
            String urlEditCardsDesc = Trello.urlCardsDesc + "?value=valueReplaceHere&" + keyAndToken;
            prop.setProperty("urlEditCardsDesc", urlEditCardsDesc);
            
        }
        /*try (InputStream in = new FileInputStream("configTrello.properties")) {

            prop.load(in);
            String keyAndToken = "key=" + prop.getProperty("trello.key") + "&token=" + prop.getProperty("trello.token");
            
            String urlGetBoard = prop.getProperty("trello.urlMembers") + keyAndToken;
            prop.setProperty("urlGetBoard", urlGetBoard);
            
            String urlGetListOfBoard = prop.getProperty("trello.urlGetListOfBoard") + keyAndToken;
            prop.setProperty("urlGetListOfBoard", urlGetListOfBoard);

            String urlGetCardsToList = prop.getProperty("trello.urlGetCardsToList") + keyAndToken;
            prop.setProperty("urlGetCardsToList", urlGetCardsToList);
            
            String urlAddCardToList = prop.getProperty("trello.urlCards")  + "?" + keyAndToken + "&idList=ididListReplaceHere" ;
            prop.setProperty("urlAddCardToList", urlAddCardToList);
            
            String urlDeletingCard = prop.getProperty("trello.urlCards") + "idCardReplaceHere?" + keyAndToken;
            prop.setProperty("urlDeletingCard", urlDeletingCard);
            
            String urlEditCardsDesc = prop.getProperty("trello.urlCardsDesc") + "?value=valueReplaceHere&" + keyAndToken;
            prop.setProperty("urlEditCardsDesc", urlEditCardsDesc);
            
        }*/ catch (Exception e) {

            e.printStackTrace();
        }

        return prop;
    }
}
