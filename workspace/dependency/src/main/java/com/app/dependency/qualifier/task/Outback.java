package com.app.dependency.qualifier.task;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Outback implements Restaurant {
    private int stakePrice;



    @Override
    public boolean selfbar() {
        return false;
    }

}
