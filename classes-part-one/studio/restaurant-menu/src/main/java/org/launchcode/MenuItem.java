package org.launchcode;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private String date;

    public MenuItem(String description, double price, String category,String date) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.date = date;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getDescription(){
        return this.description;
    }

    public Double getPrice(){
        return this.price;
    }

    public String getCategory(){
        return this.category;
    }

    public String getDate(){
        return this.date;
    }
}