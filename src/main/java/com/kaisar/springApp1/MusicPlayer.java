package com.kaisar.springApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

    public String PlayMusic() {
        return " Playing: \n" + music1.getSong() + ", \n" + music2.getSong();
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
