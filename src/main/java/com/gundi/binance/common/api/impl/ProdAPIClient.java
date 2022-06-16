package com.gundi.binance.common.api.impl;

import com.binance.api.client.domain.account.NewOrder;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Profile("prod")
public class ProdAPIClient extends BaseAPIClient {

    @Override
    public void newOrder(NewOrder newOrder) {

         this.apiRestClient.newOrder(newOrder);
    }

    @PostConstruct
    private void postConstruct() {
        System.err.println("Inside PROD");
    }
}
