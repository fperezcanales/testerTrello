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
public class Card {

    private String name;
    private String id;
    private String desc;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Card{" + "name=" + name + ", id=" + id + ", desc=" + desc + '}';
    }
}
