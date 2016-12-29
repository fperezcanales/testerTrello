/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resource;

/**
 *
 * @author Fernando
 */
public class BoardCard {

    private String nameCard;
    private String nameBoard;
    private String nameList;

    private String idCard;
    private String idBoard;
    private String idList;

    private String desCard;

    public BoardCard(Board b, List l, Card c) {
        this.nameCard = c.getName();
        this.nameBoard = b.getName();
        this.nameList = l.getName();
        this.idCard = c.getId();
        this.idBoard = b.getId();
        this.idList = l.getId();
        this.desCard = c.getDesc();
    }

    /*private String indexCard;
    private String indexBoard;
    private String indexList;
     */
    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public String getNameBoard() {
        return nameBoard;
    }

    public void setNameBoard(String nameBoard) {
        this.nameBoard = nameBoard;
    }

    public String getNameList() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList = nameList;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    public String getIdList() {
        return idList;
    }

    public void setIdList(String idList) {
        this.idList = idList;
    }

    public String getDesCard() {
        return desCard;
    }

    public void setDesCard(String desCard) {
        this.desCard = desCard;
    }

    /* public String getIndexCard() {
        return indexCard;
    }

    public void setIndexCard(String indexCard) {
        this.indexCard = indexCard;
    }

    public String getIndexBoard() {
        return indexBoard;
    }

    public void setIndexBoard(String indexBoard) {
        this.indexBoard = indexBoard;
    }

    public String getIndexList() {
        return indexList;
    }

    public void setIndexList(String indexList) {
        this.indexList = indexList;
    }
     */

    @Override
    public String toString() {
        return "Card{" + "idCard=" + idCard + ", idBoard=" + idBoard + ", nameCard=" + nameCard +", descriptionCard=" + desCard  +", nameBoard=" + nameBoard +"}";// +", nameList=" + nameList+"}";//+ ", nameList=" + nameList + ", idBoard=" + idBoard + ", idList=" + idList + ", desCard=" + desCard + '}';
    }
}
