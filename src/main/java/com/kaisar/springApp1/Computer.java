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

    @Override
    public String toString() {
        return "com.kaisar.springApp1.Computer " + id + " " + musicPlayer.PlayMusic();
    }
}
