package com.shopping.basket.model;

import java.math.BigDecimal;

/**
 * Created by Lenovo on 30/06/2017.
 */
public class Item {

    private String id;
    private String name;
    private BigDecimal price;

    public Item(String id, String name, BigDecimal price){
        this.id = id;
        this.name = name;
        this.price = price;
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

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

