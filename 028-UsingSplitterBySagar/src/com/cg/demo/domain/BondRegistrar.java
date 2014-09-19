
package com.cg.demo.domain;

import com.cg.demo.domain.MarketItem;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class BondRegistrar {

    @ServiceActivator
    public void registerBond(MarketItem item) {
        System.out.println("Registering bond: " + item.getDescription());
    }
}
