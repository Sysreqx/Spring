package com.kaisar.springApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    ArrayList<Music> musicGenre = new ArrayList<>();

    public MusicPlayer(ArrayList<Music> musicGenre) {
        this.musicGenre = musicGenre;
    }

    public String playMusic() {
        Random random = new Random();
        int r = random.nextInt(4);

        return musicGenre.get(r).getSong();
    }

}
