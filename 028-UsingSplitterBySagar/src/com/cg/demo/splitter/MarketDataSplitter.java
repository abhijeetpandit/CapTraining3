

package com.cg.demo.splitter;

import com.cg.demo.domain.Field;
import com.cg.demo.domain.FieldDescriptor;
import com.cg.demo.domain.MarketItem;

import org.springframework.integration.annotation.Splitter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class MarketDataSplitter {
    /* Splitter that produces individual fields for aggregation */
    @Splitter
    public Collection<Field> splitItem(MarketItem marketItem) {
        List<Field> messages = new ArrayList<Field>();

        Field field = new Field(FieldDescriptor.SYMBOL, marketItem.getSymbol());
        messages.add(field);

        field = new Field(FieldDescriptor.DESC, marketItem.getDescription());
        messages.add(field);

        field = new Field(FieldDescriptor.PRICE, marketItem.getPrice());
        messages.add(field);

        field = new Field(FieldDescriptor.OPEN_PRICE, marketItem.getOpenPrice());
        messages.add(field);

        field = new Field(FieldDescriptor.TYPE, marketItem.getType());
        messages.add(field);

        return messages;
    }
}
