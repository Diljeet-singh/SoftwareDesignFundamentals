/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidiljee;

/**
 *
 * @author Diljeet Singh
 */
public class Inventory {

    private String id;
    private String name;
    private int qoh;
    private int rop;
    private double sellPrice;

    public Inventory() {
    }

    public Inventory(String id, String name, double sellPrice) {
        this.id = id;
        this.name = name;
        this.sellPrice = sellPrice;
    }

    public Inventory(String id, String name, int qoh, int rop, double sellPrice) {
        this.id = id;
        this.name = name;
        this.qoh = qoh;
        this.rop = rop;
        this.sellPrice = sellPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQoh() {
        return qoh;
    }

    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    public int getRop() {
        return rop;
    }

    public void setRop(int rop) {
        this.rop = rop;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public String toString() {
        return "Inventory{" + "id=" + id + ", name=" + name + ", qoh=" + qoh
                + ", rop=" + rop + ", sellPrice=" + sellPrice + '}';
    }
    
    

}
