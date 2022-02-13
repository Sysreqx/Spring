package com.kaisar.springApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CountryMusic implements Music{
    @Override
    public String getSong() {
        return "Country music getSong()";
    }

    @Override
    public ArrayList<String> songsList() {
        ArrayList<String> countryMusicList = new ArrayList<>();
        countryMusicList.add("Country Music No 1");
        countryMusicList.add("Country Music No 2");
        countryMusicList.add("Country Music No 3");
        return  countryMusicList;
    }
}
