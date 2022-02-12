package com.kaisar.springApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<>();
    private JazzMusic jazzMusic;
    private CountryMusic countryMusic;

    @Autowired
    public MusicPlayer(JazzMusic jazzMusic, CountryMusic countryMusic) {
        this.jazzMusic = jazzMusic;
        this.countryMusic = countryMusic;
    }

    public void PlayMusic() {
        System.out.println("Playing " + jazzMusic.getSong());
        System.out.println("Playing " + countryMusic.getSong());
    }

    // IoC
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList.addAll(0, musicList);
//    }

//    public void setMusic(List<Music> musicList) {
//        this.musicList.addAll(0, musicList);
//    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public void PlayMusic() {
        // Для List
//        System.out.println("Playing: ");
//        for (int i = 0; i < musicList.size(); i++) {
//            System.out.println(i + ". " + musicList.get(i).getSong());
//        }
//    }

}
