
package com.cg.demo.domain;

import com.cg.demo.domain.MarketItem;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class StockRegistrar {

    @ServiceActivator
    public void registerStock(MarketItem item) {
        System.out.println("Registering stock: " + item.getDescription());
    }
}
