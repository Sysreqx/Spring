package com.kaisar.springApp1;

import org.springframework.stereotype.Component;

@Component
public class RhythmAndBluesMusic implements Music{
    @Override
    public String getSong() {
        return "Rhythm & blues (R&B) music getSong()";
    }
}
