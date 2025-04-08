package com.app.dependency.qualifier.task;

import org.springframework.beans.factory.annotation.Autowired;

public interface Restaurant {
    public boolean selfbar();


    public final int stakePrice = 30000;


}
