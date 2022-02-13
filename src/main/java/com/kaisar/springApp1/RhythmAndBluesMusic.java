package com.kaisar.springApp1;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;

@Component
public class RhythmAndBluesMusic implements Music{

    @PostConstruct
    public void rhythmAndBluesMusicPostConstruct() {
        System.out.println("Rhythm & blues (R&B) Initialization via @PostConstruct");
    }

    @PreDestroy
    public void rhythmAndBluesMusicPreDestroy() {
        System.out.println("Rhythm & blues (R&B) Initialization via @PreDestroy");
    }

    @Override
    public String getSong() {
        return "Rhythm & blues (R&B) music getSong()";
    }

    @Override
    public ArrayList<String> songsList() {
        return null;
    }
}
