package com.app.dependency.qualifier.task;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("vips")
public class Vips implements Restaurant {
    private int stakePrice;



    @Override
    public boolean selfbar() {
        return true;
    }


}
