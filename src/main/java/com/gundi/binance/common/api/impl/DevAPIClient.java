package com.gundi.binance.common.api.impl;

import com.binance.api.client.domain.account.NewOrder;
import com.binance.api.client.domain.account.request.CancelOrderRequest;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Profile("dev")
public class DevAPIClient extends BaseAPIClient {


    // Fix here lll
    @Override
    public void newOrder(NewOrder newOrder) {

        this.apiRestClient.newOrderTest(newOrder);

    }

    @Override
    public void cancelOrder(CancelOrderRequest cancelOrderRequest) {
        return;
    }

    @PostConstruct
    private void postConstruct() {
        System.err.println("Inside Dev");
    }


}


