/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author dthan
 */
public class Product {
    private String description;
    private double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "description=" + description + ", price=" + price + '}';
    }
    
}
