package com.kaisar.springApp1;

import com.kaisar.springApp1.MusicPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    MusicGenre musicGenre1 = MusicGenre.JAZZ;
    MusicGenre musicGenre2 = MusicGenre.COUNTRY;

    @Override
    public String toString() {
        return "com.kaisar.springApp1.Computer " + id + " Playing: \n" + musicPlayer.PlayMusic(musicGenre2);
    }
}
