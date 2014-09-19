
package com.cg.demo.splitter;

import com.cg.demo.domain.MarketItem;
import com.cg.demo.domain.MarketItemCreator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

public class MainMarketDataSplitter {
    public static void main(String[] args) throws Exception {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("splitter.xml");

        MessageChannel channel =
                context.getBean("marketDataInputChannel", MessageChannel.class);
        MarketItemCreator marketItemCreator =
                context.getBean("marketItemCreator", MarketItemCreator.class);

        for (MarketItem marketItem : marketItemCreator.getMarketItems()) {
            channel.send(MessageBuilder.withPayload(marketItem).build());
        }
    }
}
