package com.shopping.basket.factory;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Lenovo on 01/07/2017.
 */
public class ThreePoundOff implements DiscountRules {
    @Override
    public BigDecimal applyDiscounts(BigDecimal totalAmount, List<String> listOfNames) {

        return totalAmount.doubleValue()>=21? new BigDecimal(3.00): BigDecimal.ZERO;

    }
}
