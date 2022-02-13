package com.kaisar.springApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("jazzMusic") Music music1,
                       @Qualifier("countryMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: \n" + music1.getSong() + ", \n" + music2.getSong();
    }

}
