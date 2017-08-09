package com.shopping.basket;

import com.shopping.basket.model.Item;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


/**
 * Created by Lenovo on 30/06/2017.
 */
public class ShappingBasketTest {

    Item gucciBag;
    Item versaceBag;
    Item armaniBag;

    @Before
    public void setUp(){

        gucciBag = new Item("11", "Gucci Bag", new BigDecimal(10.00));
        armaniBag = new Item("22", "Armani Bag", new BigDecimal(5.00));
        versaceBag = new Item("33", "Versace Bag", new BigDecimal(7.00));
    }

    @Test
    public void testTotalItems_NoDiscount() throws Exception{
        ShoppingBasket shoppingBasket = new ShoppingBasket();

        shoppingBasket.addBasket(gucciBag);
        shoppingBasket.addBasket(armaniBag);

        assertEquals(15.0, shoppingBasket.total(), 1.00);
    }

    @Test
    public void testTotalWithAllDiscounts() throws Exception{

        ShoppingBasket shoppingBasket = new ShoppingBasket();

        List<Item> items = createListOfItemArrays();

        items.add(gucciBag);

        items.forEach(item -> shoppingBasket.addBasket(item));

        assertEquals(25, shoppingBasket.total(), 1.00);

    }

    @Test
    public void testTotalWithOnlyThreePoundOffDiscount() throws Exception{

        ShoppingBasket shoppingBasket = new ShoppingBasket();

        shoppingBasket.addBasket(gucciBag);
        shoppingBasket.addBasket(versaceBag);
        shoppingBasket.addBasket(versaceBag);

        assertEquals(21, shoppingBasket.total(), 1.00);
    }


    @Test
    public void testTotalWithOnlyGucciBagDiscount() throws Exception{

        ShoppingBasket shoppingBasket = new ShoppingBasket();

        shoppingBasket.addBasket(gucciBag);
        shoppingBasket.addBasket(gucciBag);

        Double results = shoppingBasket.total();

        assertEquals(16, shoppingBasket.total(), 1.00);
    }

    private List<Item> createListOfItemArrays(){
        List<Item> listOfItems = new ArrayList<>();

        listOfItems.add(gucciBag);
        listOfItems.add(armaniBag);
        listOfItems.add(versaceBag);

        return  listOfItems;
    }
}
