package com.shopping.basket.factory;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Lenovo on 30/06/2017.
 */
public interface DiscountRules {
    public BigDecimal applyDiscounts(BigDecimal totalAmount, final List<String> listOfNames);
}
