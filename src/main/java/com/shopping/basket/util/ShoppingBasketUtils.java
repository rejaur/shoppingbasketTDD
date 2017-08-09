package com.shopping.basket.util;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Lenovo on 01/07/2017.
 */
public final class ShoppingBasketUtils {

    public static BigDecimal addArrayPrices (final List<BigDecimal> addListPrices) {
        return addListPrices.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static long getCountGucciBag(final List<String> listOfStrings) {
        return listOfStrings.stream()
                .filter(str -> str.equalsIgnoreCase("Gucci Bag"))
                .count();
    }
}
