package com.kaisar.springApp1;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;

public class RhythmAndBluesMusic implements Music{

    @Override
    public String getSong() {
        return "Rhythm & blues (R&B) music getSong()";
    }

    @Override
    public ArrayList<String> songsList() {
        return null;
    }
}
