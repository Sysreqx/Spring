package com.kaisar.springApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

public class JazzMusic implements Music{

    @Override
    public String getSong() {
        return "Jazz Music getSong()";
    }

    @Override
    public ArrayList<String> songsList() {
        ArrayList<String> jazzMusicList = new ArrayList<>();
        jazzMusicList.add("Jazz Music No 1");
        jazzMusicList.add("Jazz Music No 2");
        jazzMusicList.add("Jazz Music No 3");

        return jazzMusicList;
    }
}
