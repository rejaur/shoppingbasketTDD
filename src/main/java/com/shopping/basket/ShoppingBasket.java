package com.shopping.basket;

import static com.shopping.basket.util.ShoppingBasketUtils.*;

import com.shopping.basket.factory.DiscountFactory;
import com.shopping.basket.model.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 30/06/2017.
 */
public class ShoppingBasket {

    private List<BigDecimal> listOfPrices = new ArrayList<BigDecimal>();
    private List<String> listOfItemNames = new ArrayList<String>();

    public void addBasket(Item item){

            listOfPrices.add(item.getPrice());
            listOfItemNames.add(item.getName());
    }


    public Double total(){

        BigDecimal totalCost = addArrayPrices(listOfPrices);

        BigDecimal discountTotal = DiscountFactory.calculateDiscount(totalCost, listOfItemNames);

        return totalCost.subtract(discountTotal).doubleValue();
    }


}
