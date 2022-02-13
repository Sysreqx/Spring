package com.kaisar.springApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<>();
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("jazzMusic") Music music1,
                       @Qualifier("countryMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String PlayMusic(MusicGenre musicGenre) {
        Random random = new Random();
        int r = random.nextInt(3);

        if (musicGenre == MusicGenre.JAZZ) {
            return (music1.songsList().get(r));
        }

        if (musicGenre == MusicGenre.COUNTRY) {
            return (music2.songsList().get(r));
        }
        return null;
    }
}
