package com.kaisar.springApp1;

import org.springframework.stereotype.Component;

@Component
public class CountryMusic implements Music{
    @Override
    public String getSong() {
        return "Country music getSong()";
    }
}
