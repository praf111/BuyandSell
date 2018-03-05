package com.buyandsell.prafull.buyandsell;

/**
 * Created by prafull on 4/3/18.
 */

public class Item {
    public String name, location, description;
    public double price;
    public long id;

    public Item(String name, String location, String description, double price, long id)
    {
        this.name = name;
        this.location = location;
        this.description = description;
        this.price = price;
        this.id = id;
    }
}
