package com.example.retaildemo.Utils;

import java.io.Serializable;
import java.util.HashMap;

public class Item implements Serializable {

    private String name;
    private String price;
    private String ressourceName;
    private HashMap<String,Boolean> stocks;

    public Item(String name, String price, String ressourceName){
        this.name = name;
        this.price = price;
        this.ressourceName = ressourceName;
    }

    public Item(String name, String price, String ressourceName, HashMap<String,Boolean> stocks){
        this.name = name;
        this.price = price;
        this.ressourceName = ressourceName;
        this.stocks = stocks;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRessourceName(){
        return ressourceName;
    }

    public Boolean getStock(String type){
        return stocks.get(type);
    }
}