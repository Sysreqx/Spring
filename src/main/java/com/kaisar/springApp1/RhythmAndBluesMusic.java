package com.kaisar.springApp1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
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
