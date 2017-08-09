package com.shopping.basket.factory;

import static com.shopping.basket.util.ShoppingBasketUtils.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 30/06/2017.
 */
public class DiscountFactory {

    public static BigDecimal calculateDiscount(final BigDecimal totalAmount, final List<String> listOfNames){

        List<DiscountRules> discountRules = new ArrayList<>();

        discountRules.add(new GucciBagDiscount());
        discountRules.add(new ThreePoundOff());

        List<BigDecimal> storeDiscountAmount = new ArrayList<>();

        discountRules.forEach(rule -> storeDiscountAmount.add(rule.applyDiscounts(totalAmount, listOfNames)));

        return addArrayPrices(storeDiscountAmount);

    }
}
