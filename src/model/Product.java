/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 *
 * @author Administrator
 */
public class Product {
    private String idPr;
    private String name;
    private int quantity;
    private double price;
    private String category;

    public Product(String idPr, String name, int quantity, double price, String category) {
        this.idPr = idPr;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public Product() {
    }
    

    public String getIdPr() {
        return idPr;
    }

    public void setIdPr(String idPr) {
        this.idPr = idPr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
}
