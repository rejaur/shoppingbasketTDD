package com.shopping.basket.factory;

import static com.shopping.basket.util.ShoppingBasketUtils.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Lenovo on 30/06/2017.
 */
public final class GucciBagDiscount implements DiscountRules {

    @Override
    public BigDecimal applyDiscounts(final BigDecimal totalAmount, final List<String> listOfStrings) {
        return getCountGucciBag(listOfStrings)>=2? new BigDecimal(2).multiply(new BigDecimal(getCountGucciBag(listOfStrings))):new BigDecimal(0);
    }


}
